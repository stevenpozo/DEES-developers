package ec.edu.espe.spaSystem.view;

import java.util.Scanner;

/**
 *
 * @author Steven Pozo,Elkin Pabón,Ercik Moreira,David Ponce DCCO-ESPE, DEES Developers
 */
        
public class optionsMenu {
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        short choice;
       
        do{
            System.out.println("Welcome to the SpaSystem! Please, choose an option:D");
            System.out.print("1.) Schedule an appointment \n");
            System.out.print("2.) Call off an appointment \n");
            System.out.print("3.) Customer Service \n");
            System.out.println("4.) Rate Service");
            System.out.print("5.) Exit \n");
            System.out.print("Choose an option: \n");
            choice = (short) input.nextInt();

        }while(choice >5);
        switch(choice){
            case 1: 
              //  Scanner name = new Scanner(System.in);
                System.out.println("First Name: ");
                String firstName;
                firstName = input.next();
                
                System.out.println("Last Name: ");
                String LastName;
                LastName = input.next();
                
                System.out.println("ID: ");
                String ID;
                ID = input.next();
                
                System.out.println("Email: ");
                String Email;
                Email = input.next();
                
                System.out.println("Type Service: ");
                String typeService;
                typeService = input.next(); 
                break;
                
            case 2: 
                System.out.println("Type your ID: ");
                String cancelID;
                cancelID = input.next();
                break;
              
            case 3: 
                System.out.println("Suggestions");
                //Lista de Sugerencias */
               
               break;
            
            case 4: 
                System.out.println("What service do you want to rate?");
                System.out.println("Type your answer into a range 1-10:");
                Short rate1;
                rate1 =input.nextShort(); 
                break;
            case 5: 
                System.out.println("Exiting Program...");
                System.exit(0);
             break;
        } 
    } 
}