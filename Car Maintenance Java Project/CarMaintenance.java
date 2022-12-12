import java.util.Scanner;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class CarMaintenance   {

   public static char printMenu()  {
      Scanner scnr = new Scanner(System.in);
      char userOption;
      
      System.out.println("");
      System.out.println("MENU");
      System.out.println("a - Enter address of repair shop(street, city, state, zip): ");
      System.out.println("c - Enter cost of maintenance/repair: ");
      System.out.println("d - Enter date of maintenance/repair: ");
      System.out.println("e - Extra comments/notes about the maintenance/repair: ");
      System.out.println("n - Enter name of repair shop: ");
      System.out.println("p - Enter parts replaced: ");
      System.out.println("t - Enter type of maintenance/repair: ");
      System.out.println("w - Enter warranty information: ");
      System.out.println("");
      
      
      System.out.println("Choose an option(Enter q to quit): ");
      userOption = scnr.next().charAt(0);
         
     while((userOption != 'a') && (userOption != 'c') && (userOption != 'd') &&
         (userOption != 'e') && (userOption != 'n') && (userOption != 'p') &&
         (userOption != 't') && (userOption != 'w') && (userOption != 'q'))  {
         System.out.println("Invalid option. Choose another option:");
         userOption = scnr.next().charAt(0);      
      } 
      
      return userOption;
   }

   

   public static String address()  {
      Scanner scnr = new Scanner(System.in);
      System.out.println("Enter address of repair shop(street, city, state, zip): ");
      String repAdd = scnr.nextLine();   
      return repAdd;
   }
   
   
   public static double cost()  {
      Scanner scnr = new Scanner(System.in);
      System.out.println("Enter the cost of maintenance/repair: ");
      double repCost = scnr.nextDouble();   
      return repCost;
   }

   public static String date()  {
      Scanner scnr = new Scanner(System.in);  
      System.out.println("Enter the date of maintenance/repair: "); 
      String repDate = scnr.nextLine();
      return repDate;
   }
   
   
   public static String notes()  {
      Scanner scnr = new Scanner(System.in);   
      System.out.println("Extra comments/notes about the maintenance/repair: ");
      String exNotes = scnr.nextLine();
      return exNotes;
   }
   
   public static String name()  {
      Scanner scnr = new Scanner(System.in);   
      System.out.println("Enter name of the repair shop: ");
      String repName = scnr.nextLine();
      return repName;
   }

   public static String parts()  {
      Scanner scnr = new Scanner(System.in);
      System.out.println("Enter parts replaced: ");
      String repParts = scnr.nextLine();
      return repParts;   
   }
   
   public static String description()  {
      Scanner scnr = new Scanner(System.in);   
      System.out.println("Enter type of service: ");
      String repType = scnr.nextLine();
      return repType;
   }
   
   public static String warranty()  {
      Scanner scnr = new Scanner(System.in);   
      System.out.println("Enter warranty information: ");   
      String warInfo = scnr.nextLine();
      return warInfo;
   }
   
   
   
   public static void main(String[] Args) {
      Scanner scnr = new Scanner(System.in);
      
      System.out.print("Enter user: ");
      String user = scnr.nextLine();
      System.out.println("User: " + user);
         
      
      while(true) {
         switch(printMenu()){
         case 'q':
            return;
         case 't':
            System.out.println("Description: " + description());
            break;
         case 'n':
            System.out.println("Name: " + name());
            break;
         case 'a':
            System.out.println("Address: " + address());
            break;
         case 'd':
            System.out.println("Repair date: " + date());
            break;
         case 'c':
            System.out.println("Cost: $" + cost());
            break;
         case 'p':
            System.out.println("Parts Replaced: " + parts());
            break;
         case 'w':
            System.out.println("Warranty: " + warranty());
            break;
         case 'e':
            System.out.println("Comments: " + notes());
            break; 
         }
      }
      
         
   }
}

/* Car Maintenance Print Info(PDF)
   shows the program being ran,
   with the user inputting the information
*/ 

// Ahmaad Jackson