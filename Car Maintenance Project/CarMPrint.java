import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CarMPrint {
    public static void main(String[] args) {
        try{
            String path="RepairInfo.txt";
            File file = new File(path);

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            //For User story 1
            bw.write("User 1");
            bw.newLine();
            bw.write("Description: Oil Change");
            bw.newLine();
            bw.write("Name: Sears Auto");
            bw.newLine();
            bw.write("Address: 100 Main Street New York, NY 10001");
            bw.newLine();
            bw.write("Repair date: 3/2/2016");
            bw.newLine();
            bw.write("Cost: $24.95");
            bw.newLine();
            bw.write("Comments: None");
            bw.newLine();
            bw.newLine();
            bw.newLine();
            
            //For User story 2
            bw.write("User 2");
            bw.newLine();
            bw.write("Description: Brake Replacement");
            bw.newLine();
            bw.write("Name: Midas");
            bw.newLine();
            bw.write("Address: 250 First Street New York, NY 10001");
            bw.newLine();
            bw.write("Repair date: 6/3/2016");
            bw.newLine();
            bw.write("Cost: $280.00");
            bw.newLine();
            bw.write("Parts Replaced : Brakes");
            bw.newLine();
            bw.write("Warranty: 6 Months");
            bw.newLine();
            bw.write("Comments: Mechanic said to fix shocks");
            bw.newLine();
            

            bw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

/* This program prints the information that is
   in the CarMaintenance.java file and puts it 
   in the RepairInfo.txt text file. */
   
/* When I tried to create/write the code 
   into CarMaintenance.java it was 
   acting strange with the while loops
   & try-catch blocks, therefore I just 
   manually entered the information into 
   CarMPrint.java */
   
// Ahmaad Jackson