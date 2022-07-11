package ec.edu.espe.spaSystem.model;

/**
 *
 * @author Steven Pozo,Elkin Pabón,Ercik Moreira,David Ponce, DCCO-ESPE, DEES Developers
 */
public class Client {
    private String name;
    private String lastName;
    private String phoneNumber;
    private String ID;
    private int age;

    public Client() {
        
    }

    public Client(String name, String cellphone, String ID, int age) {
        this.name = name;
        this.phoneNumber = cellphone;
        this.ID = ID;
        this.age = age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Client(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellphone() {
        return phoneNumber;
    }

    public void setCellphone(String cellphone) {
        this.phoneNumber = cellphone;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", cellphone=" + phoneNumber+ ", ID=" + ID + ", age=" + age + '}';
    }

    //FUNCIONES:
    public void scheduleAppointment(){
        
    }
    public void cancelAppointment(){
        
    }
    public void deferAppointment(){
        
    }
    public void chooseService(){
        
    }
    
    public void rateService(){
    
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }
    
}
 
