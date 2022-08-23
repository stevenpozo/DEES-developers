
package ec.edu.espe.Spa.controller;

import org.bson.Document;


/**
 *
 * @author Steven Pozo, Erick Moreira, Elkin Pabón, Diego Ponce, DCCO-ESPE, DEES Developers
 */
public interface CustomerInterface {
    public Document RegisterAndBuildDocument(String firstName,String lastName, String identification, String cellphone, String email,String typeOfService, String cost, String timeOfTreatment, String date, String hourOfAttention);
    public void calculateTotalCost();
}


