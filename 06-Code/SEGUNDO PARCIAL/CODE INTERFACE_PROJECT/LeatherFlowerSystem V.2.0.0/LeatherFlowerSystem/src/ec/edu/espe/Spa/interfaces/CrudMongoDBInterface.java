
package ec.edu.espe.Spa.interfaces;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

/**
 *
 * @author Steven Pozo, Erick Moreira, Elkin Pabón, Diego Ponce, DCCO-ESPE, DEES Developers
 */
public interface CrudMongoDBInterface {
    
    public void createToDatabase(Document document);
    public Document readToDatabase(String key, String value);
    public void uploadToDatabase(Document query, Document upload);
    public void deleteToDatabase(Document document);
    public MongoCollection<Document> getMongoCollection(); 
}
