/**
 * Text Data and Binary Data
 */
package icp_java_week4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

/**
 * @author David Ebo Adjepon-Yamoah
 * @version 1.0.2
 */
public class WriteToFile implements Serializable{

	/**
	 * Serial Version User ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor
	 */
	public WriteToFile() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Writing Text/String to File using PrintWriter and FileOutputStream
	 * Checks for "FileNotFoundException" in the connection to the file
	 */
    public void writingTextToFile() {
  		    
    		PrintWriter printWriter = null;
    		
    		try {
    			//Note that we are able to append to the file because of the "true" parameter
    			printWriter = new PrintWriter(new FileOutputStream("fileName1.txt", true));
    		}catch(FileNotFoundException fnfe) {
    			fnfe.getMessage();
    		}
    		
  		    printWriter.print("Some String");
  		    printWriter.println();
  		    
  		    //Note the use of "printf()"
  		    printWriter.printf("Product name is %s and its price is %d $", "iPhone", 1000);
  		    printWriter.println();
  		  
  		    //Close Writer
  		    printWriter.close();
  	}
    
    /**
     * Writing Binary Data to File
     * @throws IOException
     */
    public void writingBinaryDataToFile() throws IOException {
        String str = "Hello";			
        FileOutputStream outputStream = new FileOutputStream("fileName2.txt");
        
        //Convert String to Bytes
        byte[] strToBytes = str.getBytes();
                
        //Write Bytes to File
        outputStream.write(strToBytes);
        
        //System.out.println("Output Stream Object: "+outputStream.toString());
        //Close Stream
        outputStream.close();
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WriteToFile pwd = new WriteToFile();
	      
	      try {
			pwd.writingTextToFile();
			pwd.writingBinaryDataToFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
