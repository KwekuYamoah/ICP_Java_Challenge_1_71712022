/**
 * This is the ICP challenge 1 which is to be done in java
 * Author: Kweku Andoh Yamoah(71712022)
 * Testing the methods
 */
import java.io.IOException;

public class testICP_Challenge {

    public static void main(String[] args) throws IOException {
        int jh = (int) 5.5;
        System.out.println (jh);
        System.out.println ("Welcome to the test for Essentials stock management system"
                            + "\n Please sit back and enjoy");
        ICP_Challenge_1 Essentials = new ICP_Challenge_1 ();
        String primaryFIle = Essentials.filename = "essentials_stock.txt";
        String backupFile = Essentials.backupfile = "backup_essentials_stock.txt";

        Essentials.clearFile(primaryFIle);  // clearing files before writing
        Essentials.clearFile (backupFile);   // clearing files before writing
        //Taking the stocks
        Essentials.Stock ();
        //Printing the results

        System.out.println ("The stocks we have for today are:\n, in Capture Format: <item> <quantity> <GHC price>");
        Essentials.printStock ();
    }
}
