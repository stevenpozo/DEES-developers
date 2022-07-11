package ec.edu.espe.spaSystem.view;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Steven Pozo,Elkin Pabón,Ercik Moreira,David Ponce DCCO-ESPE, DEES Developers
 */
        
public class LeatherFlowerSystem {
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Scanner textInput;
        textInput = new Scanner(System.in);
        String textData;
        
        textInput = new Scanner(System.in);
        String password1;
        String userName1;
        String password = "PasswordStefaM22";
        String userName = "StefaM22";
        short opc;
        opc = 0; 
        
        do{
            System.out.println("Type your username:");
            userName1 = scanner.next();
             System.out.println("Type your password:");
            password1 = scanner.next();
        }while(!(userName1.equals(userName) && password1.equals(password)));
        do{ 
            System.out.println("=====LEATHER FLOWER SYSTEM=====");
            System.out.println("1.Schedule an appointment");
            System.out.println("2.Call off an appointment");
            System.out.println("3.Exit");
            System.out.println("Choose an option please: ");
            opc = scanner.nextShort();
        }while(opc > 3);
        
        switch(opc){
            case 1:
                System.out.println("Schedule an appointment");
                System.out.println("\nType your name");
                try {
                    FileWriter fileWriter;
                    BufferedWriter bufferedWriter;
                    String path = "C:\\Users\\steve\\Desktop\\POO\\PROYECTO\\CODE\\Clientes.txt";

                    File file = new File(path);
                    fileWriter = new FileWriter(file);
                    bufferedWriter = new BufferedWriter(fileWriter);

                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    
                    System.out.println("=================================");
                    System.out.println("|====ENTER THE REQUESTED DATA===|");
                    System.out.println("=================================");
                    System.out.println("Type your name:");
                    textData = textInput.nextLine();
                    bufferedWriter.write(textData);
                    bufferedWriter.newLine();
                    System.out.println("Type your last name:");
                    textData = textInput.nextLine();
                    bufferedWriter.write(textData);
                    bufferedWriter.newLine();
                    System.out.println("Type your phone number");
                    textData = textInput.nextLine();
                    bufferedWriter.write(textData);
                    bufferedWriter.newLine();
                    System.out.println("Type your ID");
                    textData = textInput.nextLine();
                    bufferedWriter.write(textData);
                    bufferedWriter.newLine();
                    System.out.println("Type your age");
                    textData = textInput.nextLine();
                    bufferedWriter.write(textData);
                    bufferedWriter.newLine();
                    bufferedWriter.close();
                    } catch (IOException e) {
                    e.printStackTrace();                    }
                    break;
                
            case 2:
                String lineToRemove = "Erick";

                File inputFile = new File("C:\\Users\\steve\\Desktop\\POO\\PROYECTO\\CODE\\Clientes.txt");
                File outputFile = new File("C:\\Users\\steve\\Desktop\\POO\\PROYECTO\\CODE\\Clientes_new.txt");

                try {
                  BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                  BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

                String currentLine;

                while((currentLine = reader.readLine()) != null) {                        
                    if(currentLine.trim().equals(lineToRemove)){ 
                        continue;
                    }
                writer.write(currentLine + System.getProperty("line.separator"));
                }       

                writer.close();
                reader.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
                
                    
            break;
                    
            case 3:
            System.out.println("Exiting Program...");
            System.exit(0);
            break;
        }
    } 
}