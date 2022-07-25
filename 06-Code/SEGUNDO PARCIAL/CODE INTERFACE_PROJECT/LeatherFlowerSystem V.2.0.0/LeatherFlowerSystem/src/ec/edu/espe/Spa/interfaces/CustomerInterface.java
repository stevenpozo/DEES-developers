
package ec.edu.espe.Spa.interfaces;

import org.bson.Document;


/**
 *
 * @author Steven Pozo, Erick Moreira, Elkin Pabón, Diego Ponce, DCCO-ESPE, DEES Developers
 */
public interface CustomerInterface {
public Document RegisterAndBuildDocument(String fullNames,String surnames, String identification, String cellphone, String email,String typeOfService, String cost, String timeOfTreatment, String date, String hourOfAttention);
 
}
