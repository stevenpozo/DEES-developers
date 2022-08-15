
package ec.edu.espe.Spa.controller;

import ec.edu.espe.Spa.model.User;
import org.bson.Document;



/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class UserController extends CrudMongoDBController implements UserInterface{

    public UserController(String mongoCollection) {
        super(mongoCollection);
    }
    

    @Override
    public Document buildDocumentUser(User user) {
        Document document = new Document();
        document.append("username", user.getUsername()).
                append("password", user.getPassword());

        return document;    }
    
    
    
}
