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
public class Service {

    private String type;
    private String date;
    private String hourOfAttention;
    private float cost;

    public Service(String type, String date, String hourOfAttention, float cost) {
        this.type = type;
        this.date = date;
        this.hourOfAttention = hourOfAttention;
        this.cost = cost;
    }

    public Service() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHourOfAttention() {
        return hourOfAttention;
    }

    public void setHourOfAttention(String hourOfAttention) {
        this.hourOfAttention = hourOfAttention;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Service{" + "type=" + type + ", date=" + date + ", hourOfAttention=" + hourOfAttention + ", cost=" + cost + '}';
    }

//    public void addAppointment() {
//        System.out.println("Type Name: ");
//        System.out.println("Type Name: ");
//        System.out.println("Type Name: ");
//        System.out.println("Type Name: ");
//        System.out.println("Type Name: ");
//    }


    public void billService() {

    }

    public int giveDisscount(int numberOfServices) {
        float price;
        float finalPrice = 0;
        int discount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola querido cliente, antes de agendar veremos si usted es merecedor de un descuento en nuestra tienda");
        System.out.println("Cuantos servicios desea agendar hoy?");
        numberOfServices = scanner.nextInt();
        if (numberOfServices <= 0) {
            System.out.println("Dato incorrecto, por favor escriba una respuesta acorde");
            discount = 0;
            return discount;
        }

        if (numberOfServices == 1) {
            System.out.println("Por el momento no aplicaremos ningun descuento para usted");
            discount = 0;
            return discount;
        }
        if (numberOfServices == 2) {
            System.out.println("Muy bien! usted recibira un pequenio descuento:");
            System.out.print("Cual es el costo de su servicio?: ");
            price = scanner.nextFloat();
            finalPrice = price * 0.05F;
            System.out.println("Su descuento es de: " + finalPrice + "$");
            discount = 5;
            return discount;
        }
        if (numberOfServices >= 3) {
            System.out.println("Muy bien! usted recibira un descuento un poco mejor");
            System.out.print("Cual es el costo de su servicio?: ");
            price = scanner.nextFloat();
            finalPrice = price * 0.10F;
            System.out.println("Su descuento es de: " + finalPrice + "$");
            discount = 10;
            return discount;

        }
        return 0;

    }

    public void chooseService() {
        int optionService;
        optionService=validateServiceMenu();
        Customer customer=new Customer();
        
            switch (optionService) {
                case 1 ->
                    System.out.println("1. Laser depilation");
                case 2 ->
                    System.out.println("2. Facial treatment");
                case 3 ->
                    System.out.println("3. Acne treatment");
                case 4 ->
                    System.out.println("4. Stain blurring");

                case 5 ->
                    System.out.println("5. Deep hydration");
                case 6 ->
                    System.out.println("6. Chemical peeling");

                case 7 ->
                    System.out.println("7. Platelet rich plasma");

                case 8 ->
                    System.out.println("8. Reduction measures");

                case 9 ->
                    System.out.println("9. Body toning");

                case 10 ->
                    System.out.println("10. Blurring of stretch marks");

                case 11 ->
                    System.out.println("11. Increasing of buttocks");

                case 12 ->
                    System.out.println("12. Ionic detox");

                case 13 ->
                    System.out.println("13. Microblanding");
            }
    }
    public void showServices(){
            System.out.println("1. Laser depilation");
            System.out.println("2. Facial treatment");
            System.out.println("3. Acne treatment");
            System.out.println("4. Stain blurring");
            System.out.println("5. Deep hydration");
            System.out.println("6. Chemical peeling");
            System.out.println("7. Platelet rich plasma");
            System.out.println("8. Reduction measures");
            System.out.println("9. Body toning");
            System.out.println("10. Blurring of stretch marks");
            System.out.println("11. Increasing of buttocks");
            System.out.println("12. Ionic detox");
            System.out.println("13. Microblanding");
            System.out.println("Choose the service you want to schedule");
    }
    public int validateServiceMenu() {
    Scanner s = new Scanner(System.in);
    int option;
    while (true) {
        showServices();
        if (s.hasNextInt()) {
            option = s.nextInt();
            if (option >= 1 && option <=13) {
                return option;
            } else {
                System.out.println("Choose an option between 1 and 4");
                System.out.println("Type again: ");
            }
        } else {
            System.out.println("The characters entered are not");
            System.out.println("Type again: ");
            s.next();
        }
    }
    
}
}
