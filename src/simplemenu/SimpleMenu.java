
package simplemenu;

import static java.lang.System.exit;
import java.util.Scanner;
import java.util.*;

/**
 * Szymon Wojdyla
 * EC 2023348
 * Edinburgh College 
 */
public class SimpleMenu {


    
    // declaration of the global variables 
    public static String adminName;
    public static int entry;
    
    
    public static void start(){
           
        // displaying menu to the user  
        System.out.println("Please select one of the option listed below:\n" );
       	System.out.println("Option 1: Generate an username" );
        System.out.println("Option 2: Calculate the factorial number" );
        System.out.println("Option 3: Quit the program\n" );
        System.out.print("Please insert the number of your choice: " );
        
        // read the keyboard
        Scanner keyboard = new Scanner(System.in);
        entry = keyboard.nextInt();

        // switch statement - user is expected to chose an option from the menu
        switch (entry) {
        
            case 1: 
                // calling method Choice1()
                Choice1(); 
                
                
            
            case 2: 
                // calling method Choice2();
                Choice2();
                
                
                
            case 3:
                // calling method Choice3();
                Choice3();
                
                // calling successful termination
                exit(0);
            
            // to be used while calling any invalid choice from the menu
            default:
                    
                System.out.println("Invalid choice.");
                
                // going back to the menu options
                start();
        }
    }
// method responsible for task 1       
public static void Choice1(){
    
    System.out.println("********************************************\n" );
    
    // display to the user the option which has been chosen 
    System.out.println("This is option 1 " + adminName );
    // read the keyboard 
    Scanner sc = new Scanner(System.in);
    // asking user for the input (String)
    System.out.print("Please enter your first and last name: " );
    String fullName = sc.nextLine();
    
    // declaration of an array of Strings
    String [] nameParts = fullName.split(" ");
    
    // creating  an username for the user
    String username = nameParts[0].charAt(0) + nameParts[1];
    
    // displaying the name of the user and generated username
    System.out.println("staff name is: " + fullName + ", username generated is: " + username);
    System.out.println("********************************************\n" );
    
    // going back to the menu options
    start();
}

// method responsible for task 2 
public static void Choice2(){
    
    System.out.println("********************************************\n" );
    
    // display to the user the option which has been chosen
    System.out.println("This is option 2 " + adminName );
    
    // an exception handling to catch invalid input
    try {
        
        // read the keyboard and asking user for an input
        Scanner sc = new Scanner(System.in);
        System.out.print("Option 2 calculates the factorial of given number. Please insert your number: " );
        int number = sc.nextInt();
        
        // condition for invalid input
        if(number < 0 )
            
            // message to the user explaining invalid input
            System.out.println("\t Inserted number should be non-negative.");
            
        else {
            // declaration of a local variable 
            long factorial = 1;
            
            // for loop to calculate the factorial of a given number
            for (int i = 1; i <= number; ++i){

                factorial *= i;

            }
            // for loop - for better user'sunderstanding how factorial has been calculated
            for(int i = number; i > 1; i--){
                System.out.print( i + " * ");
            }    

            System.out.println("1 = " + factorial);

        }
    }
            catch(Exception e){}
    
    System.out.println("********************************************\n" );
    
    // going back to the menu options
    start();
}

// method responsible for task 3 
public static void Choice3(){
    
    // display to the user the option which has been chosen
    System.out.println("********************************************\n" );
    System.out.println("This is option 3 " + adminName );
    System.out.println("\t\tGood Bye");
    System.out.println("********************************************\n" );
}

// method which welcomes user by name
public static void sayHello(String name){
    
        // displaying user's name
        System.out.println("********************************************" );
        System.out.println("\t\t Welcome " + name);
        System.out.println("********************************************" );
}
    
    public static void main(String[] args) {
        
        // read the keyboard and asking user for an input
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the administrator's name: " );
        adminName = sc.nextLine();
        
        // parameter passing 
        sayHello(adminName);
        
        // calling the method to display menu options
        new SimpleMenu().start(); 
    }
    
}
