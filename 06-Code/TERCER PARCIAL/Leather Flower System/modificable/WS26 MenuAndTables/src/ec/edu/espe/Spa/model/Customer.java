package ec.edu.espe.Spa.model;

/**
 *
 * @author Steven Pozo, Erick Moreira, Elkin Pabón, Diego Ponce, DCCO-ESPE, DEES Developers
 */
public class Customer extends Service {

    protected String firstName;
    protected String lastName;
    protected String identification;
    protected String cellphone;
    protected String email;
    

public Customer(String firstName, String lastName, String identification, String cellphone, String email, String typeOfService, String cost, String timeOfTreatment, String date, String hourOfAttention) {
    super(typeOfService, cost, timeOfTreatment, date, hourOfAttention);
    this.firstName = firstName;
    this.lastName = lastName;
    this.identification = identification;
    this.cellphone = cellphone;
    this.email = email;
}

    public Customer() {
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
