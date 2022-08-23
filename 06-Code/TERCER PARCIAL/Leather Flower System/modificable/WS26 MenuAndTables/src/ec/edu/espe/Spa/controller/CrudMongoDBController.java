
package ec.edu.espe.Spa.controller;

import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.ReplaceOptions;
import org.bson.Document;

/**
 *
 * @author Steven Pozo, Erick Moreira, Elkin Pabón, Diego Ponce, DCCO-ESPE, DEES Developers
 */
public class CrudMongoDBController implements CrudMongoDBInterface {
    
    private MongoCollection<Document> mongoCollection;

    public CrudMongoDBController(String mongoCollection) {

        this.mongoCollection = MongoDBConnection.database.getCollection(mongoCollection);
    }

    @Override
    public void createToDatabase(Document document) {
        mongoCollection.insertOne(document);
    }

    @Override
    public Document readToDatabase(String key, String value) {
        return mongoCollection.find(eq(key, value)).first();
    }

    @Override
    public void uploadToDatabase(Document query, Document upload) {
        ReplaceOptions options = new ReplaceOptions().upsert(true);
        mongoCollection.replaceOne(query, upload, options);
    }

    @Override
    public void deleteToDatabase(Document document) {
        mongoCollection.deleteOne(document);
    }

    @Override
    public MongoCollection<Document> getMongoCollection() {
        return mongoCollection;
    }

    @Override
    public Document read(Document document) {
        return mongoCollection.find(document).first();
    }
    
}
