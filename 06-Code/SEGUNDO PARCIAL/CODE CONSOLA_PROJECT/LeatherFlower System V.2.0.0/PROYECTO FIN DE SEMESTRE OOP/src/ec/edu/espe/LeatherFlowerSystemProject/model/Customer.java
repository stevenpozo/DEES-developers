
package ec.edu.espe.LeatherFlowerSystemProject.model;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.Scanner;
import org.bson.Document;
/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class Customer {
    private String names;
    private String surnames;
    private String cellphone;
    private String ID;
    private String email;

    public Customer(String names, String surnames, String cellphone, String ID, String email) {
        this.names = names;
        this.surnames = surnames;
        this.cellphone = cellphone;
        this.ID = ID;
        this.email = email;
    }

    public Customer() {
    }
    

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" + "names=" + names + ", surnames=" + surnames + ", cellphone=" + cellphone + ", ID=" + ID + ", email=" + email + '}';
    }
    
    
    //FUNTIONS
    
//    public void scheduleAppointment(){
//        Scanner scanner = new Scanner(System.in);
//        Customer customer = new Customer(names,surnames,cellphone,ID,email);
//        Service service = new Service();
//        
//        System.out.println("Type Names: ");
//        String names= scanner.nextLine();
//        System.out.println("Type Surnames: ");
//        String surnames= scanner.nextLine();
//        System.out.println("Type Cellphone: ");
//        String cellphone= scanner.nextLine();
//        System.out.println("Type ID: ");
//        String ID= scanner.nextLine();
//        System.out.println("Type Email: ");
//        String email= scanner.nextLine();
//        //customer.toString();
//        System.out.println("choose service");
//    }
        public boolean scheduleAppointment() {
        MongoDBConnection mongoDB;
        mongoDB = new MongoDBConnection();
      //  mongoDB.conectionMongo();
        MongoClient userDB;
        MongoDatabase userdatabase;
        MongoCollection userCollection;
        Document document;
        Scanner input;
        String addCustomer;
        
        userDB= mongoDB.conectionMongo();
        userdatabase=userDB.getDatabase("LeatherFlowerSystem");
        userCollection= userdatabase.getCollection("Customer");
        
        document=new Document();
        input= new Scanner(System.in);
        
        System.out.println("CUSTOMER");
        System.out.println("Type Full Names:");
        addCustomer= input.next();
        document.append("Full Names",addCustomer);
        
        System.out.println("Type Surnames");
        addCustomer= input.next();
        document.append("Surnames",addCustomer);
        
        System.out.println("Type Cellphone");
        addCustomer= input.next();
        document.append("Cellphone",addCustomer);
        
        System.out.println("Type ID");
        addCustomer= input.next();
        document.append("ID",addCustomer);
        
        System.out.println("Type Email");
        addCustomer= input.next();
        document.append("Email",addCustomer);
        userCollection.insertOne(document);
       return true;
    }
    public void deferAppointment(){
        
    }
    public void calcelAppointment(){
        
    }

}
