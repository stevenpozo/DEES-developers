
package ec.edu.espe.Spa.controller;

import org.bson.Document;


/**
 *
 * @author Steven Pozo, Erick Moreira, Elkin Pabón, Diego Ponce, DCCO-ESPE, DEES Developers
 */
public class CustomerController extends CrudMongoDBController implements CustomerInterface{

    public CustomerController(String mongoCollection) {
        super(mongoCollection);
    } 

    @Override
    public Document RegisterAndBuildDocument(String fullNames, String surnames, String identification, String cellphone, String email, String typeOfService, String cost, String timeOfTreatment, String date, String hourOfAttention) {
        Document document = new Document("fullNames", fullNames)
            .append("surnames", surnames)
            .append("identification", identification)
            .append("cellphone", cellphone)
            .append("email", email)
            .append("typeOfService", typeOfService)
            .append("cost", cost)
            .append("timeOfTreatment", timeOfTreatment)
            .append("date", date)
            .append("hourOfAttention",hourOfAttention);

    return document;
    }
}
