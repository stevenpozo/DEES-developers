
package ec.edu.espe.Spa.controller;

import ec.edu.espe.Spa.model.User;
import org.bson.Document;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public interface UserInterface {
    public Document buildDocumentUser(User user);
}
