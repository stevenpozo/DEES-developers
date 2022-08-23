
package ec.edu.espe.Spa.model;

/**
 *
 * @author Steven Pozo, Erick Moreira, Elkin Pabón, Diego Ponce, DCCO-ESPE, DEES Developers
 */
public class Service {
    private String typeOfService;
    private String cost;
    private String timeOfTreatment;
    private String date;
    private String hourOfAttention;
    
    
    public Service(){
    
    }

    public Service(String typeOfService, String cost, String timeOfTreatment, String date, String hourOfAttention) {
        this.typeOfService = typeOfService;
        this.cost = cost;
        this.timeOfTreatment = timeOfTreatment;
        this.date = date;
        this.hourOfAttention = hourOfAttention;
    }

    /**
     * @return the typeOfService
     */
    public String getTypeOfService() {
        return typeOfService;
    }

    /**
     * @param typeOfService the typeOfService to set
     */
    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    /**
     * @return the cost
     */
    public String getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(String cost) {
        this.cost = cost;
    }

    /**
     * @return the timeOfTreatment
     */
    public String getTimeOfTreatment() {
        return timeOfTreatment;
    }

    /**
     * @param timeOfTreatment the timeOfTreatment to set
     */
    public void setTimeOfTreatment(String timeOfTreatment) {
        this.timeOfTreatment = timeOfTreatment;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the hourOfAttention
     */
    public String getHourOfAttention() {
        return hourOfAttention;
    }

    /**
     * @param hourOfAttention the hourOfAttention to set
     */
    public void setHourOfAttention(String hourOfAttention) {
        this.hourOfAttention = hourOfAttention;
    }
    
}
