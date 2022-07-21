
package ec.edu.espe.LeatherFlowerSystemProject.view;
import ec.edu.espe.LeatherFlowerSystemProject.model.Customer;
import ec.edu.espe.LeatherFlowerSystemProject.model.Manager;
import ec.edu.espe.LeatherFlowerSystemProject.model.MongoDBConnection;
import ec.edu.espe.LeatherFlowerSystemProject.model.Service;

import java.util.Scanner;


/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class LeatherFlowerSystemDisplay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MongoDBConnection mongoDBConnection;
        mongoDBConnection = new MongoDBConnection();
        Manager manager;
        manager =new Manager();
        Service service;
        service =new Service();
        Customer customer = new Customer();
        
        int option;
   
//        USUARIO Y CONTRASEÑA DEL USUARIO
        manager.logIn();
//        MENU PRINCIPAL
        option=showMenu();
        switch(option){
            case 1:
                //        ELEJIR EL SERVICIO
                        //  service.chooseService();
                          customer.scheduleAppointment();
                          break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        
        
    }
    
    //FUNTIONS:
    public static int showMenu() {
    Scanner s = new Scanner(System.in);
    int option;
    while (true) {
        showPrincipalMenu();
        if (s.hasNextInt()) {
            option = s.nextInt();
            if (option >= 1 && option <=4) {
                return option;
            } else {
                System.out.println("Choose an option between 1 and 4");
                System.out.println("Type again: ");
            }
        } else {
            System.out.println("The characters entered are not correct");
            System.out.println("Type again: ");
            s.next();
        }
    }
    
}
            public static void showPrincipalMenu(){
            System.out.println("==========WELCOME ESTEFANIA=============\n");
            System.out.println("\t\tMENU");
            System.out.println("1. Schedule Appointment");
            System.out.println("2. Defer Appointment");
            System.out.println("3. Cancel Appointment");
            System.out.println("4. Exit");
            System.out.println("Choose one option:  ");
    }
}