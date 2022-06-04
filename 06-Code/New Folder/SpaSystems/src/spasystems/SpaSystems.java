
package ec.edu.espe.spaSystem.view;

import java.util.Scanner;

/**
 *
 * @author Steven Pozo,Elkin Pabón,Ercik Moreira,David Ponce DCCO-ESPE, DEES Developers
 */
public class SpaSystem {
   public static void main(String[] args) {
        
    }
        
        Scanner opc = new Scanner(System.in);
        int opcSelect;
        
        do{
        System.out.println("This is the spaSystem");
        System.out.println("Option Menu");
        System.out.println("1. Schedule an appointment \n");
        System.out.println("2. Cancel appointment \n");
        System.out.println("3. Customer Support \n");
        System.out.println("4. Salir");
        
        opcSelect=opc.nextInt();
        }
        while(opcSelect<4);
        switch(opcSelect){
            
            case 1: 
                System.out.println("Enter the requested data \n");
                System.out.println("PERSONAL INFORMATION: \n");
                    System.out.println("Surnames:\n");
                    System.out.println("Names:\n");
                    System.out.println("ID number:\n");
                    System.out.println("E-mail: ");
                
            case 2:
                System.out.println("Enter the requested data \n");
                    System.out.println("Surnames:\n");
                    System.out.println("Names:\n");
                    System.out.println("ID number:\n");
                    System.out.println("E-mail: ");
                    break;
            case 3:
                System.out.println("---CUSTOMER SUPORT---");
                    System.out.println("Suggestions");
                    break;
            case 4:
                System.out.println("---CUSTOMER SUPORT---");
                    
                    break;     
        }
    } 
    //review 
   //commit example
