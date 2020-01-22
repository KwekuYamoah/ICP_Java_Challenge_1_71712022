/**
 * This is the ICP challenge 1 which is to be done in java
 * Author: Kweku Andoh Yamoah(71712022)
 * Challenge will be implemented in phases
 */

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class ICP_Challenge_1 {
    public  String filename;
    public  String backupfile;
    public String stockContent = "";
    String[] words;

    public ICP_Challenge_1() {
    }

    /**
     * Implementing phase 1
     * Taking a number of stock from the shop
     * Using the stock method
     */


    /**
     * Stock method, which completes phase 2 and 3
     * @throws IOException
     */
    public void Stock() throws IOException {
        /**
         * Inputs for stock attributes ie,
         * name, quantity and price
         */
        Scanner nameofItem = new Scanner(System.in);
        Scanner quantofItem = new Scanner(System.in);
        Scanner priceofItem = new Scanner(System.in);
        Scanner stocksToCreate = new Scanner(System.in);

        System.out.print("How many stocks are we having today(Eg 5):\n");
        int stockInput = stocksToCreate.nextInt ();
        Integer[] forQuant = new Integer [stockInput];
        for(int i = 0 ; i < forQuant.length;i ++){
            System.out.println ("Enter the name of the stock(Eg: Pepsi): \n");
            String name = nameofItem.nextLine ();
            System.out.println ("Enter the quantity of the stock(Eg:14): \n");
            int quantity = quantofItem.nextInt ();
            System.out.println ("Enter the price of the stock(Eg:3.00): \n");
            double price = priceofItem.nextDouble ();
            //Creating an instance of the Item class;
            Item temp = new Item (name,quantity,price);
            try {

                writeFile (filename, temp); //phase 2 ends here
                writeFile (backupfile, temp); //phase 3 ends here
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }


    }

    /**
     * Private nested class to process items as
     * name, quantity, price format
     */
    protected static class Item{
        String itemName;
        int quantity;
        double price;

        /**
         * Constructor
         * @param itemName, String of the name of the item
         * @param quantity, integer value representation for quantity
         * @param price, integer value representation for price plus GHS
         */
        public Item(String itemName, int quantity, double price) {
            this.itemName = itemName;
            this.quantity = quantity;
            this.price = price;
        }

        public String getItemName() {
            return itemName;
        }

        public int getQuantity() {
            return quantity;
        }

        public double getPrice() {
            return price;
        }
    }

    /**
     * Initiating phase 2 and phase 3
     * Writing the information gathered about the stock into a primary text file
     * and also a backup file
     *
     * writeFile method writes the information of a stock,
     * of type item into a primary file and a backup file
     * @param filename, String of the file going to be used for backup
     * @param stock, an object of type Item
     * @throws IOException
     */
    public  void writeFile(String filename, @NotNull Item stock) throws IOException {
        String itemAttribute = stock.getItemName () + "\t\t" + stock.getQuantity () + "\t\t" + stock.getPrice ();

        /**
         * Creating a new file writer instance
         * Wrapping buffered writer around file read
         * to ensure efficient writing of stock
         * create a newline to write characters to and writing the characters
         * The file is closed and itemAttribute string is made empty again.
         */
        try {
            BufferedWriter inW = new BufferedWriter (new FileWriter (filename, true));
            inW.flush (); //Clearing the writer stream before writing.
            inW.newLine ();
            inW.write (itemAttribute);
            inW.close ();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * A method to clear the text file which keeps track of the old stock,
     * before the new stocks are written
     * @param filename, string of the files we ant to clear
     * @throws IOException
     */
    public void clearFile(String filename) throws IOException {
        try{
        FileWriter fileWrite = new FileWriter (filename, false);
        PrintWriter pWrite = new PrintWriter (fileWrite, false); //preventing the auto-clearing of the writer stream
        pWrite.flush (); //clearing the writer stream
        fileWrite.close ();
        }
        catch (IOException e) {
            e.printStackTrace ();
        }

    }

    /**
     * Phase 4 displaying the content of,
     * essentials_stock.txt
     * printStock displays the contents of this file
     * @throws IOException
     */
    public void printStock() throws IOException {
        /**
         * Creating a new file reader instance
         * Wrapping buffered reader around file read
         * to ensure efficient reading of stock
         */


        BufferedReader buffRead = new BufferedReader (new FileReader (filename));
        String line = null;
        String data = "";
        /**Reading lines and splitting the data
         into an array of String stocks, called words
         */
        System.out.println ("Name" +"\tQuantity " + "\tPrice");
        while ((line = buffRead.readLine ()) != null) {
            data = line;

            words = data.split (" ");
            for (int i = 0; i < words.length; i++) {
                stockContent += words[i];
            }
            System.out.println (stockContent);
            stockContent = "";

        }
    }
}
