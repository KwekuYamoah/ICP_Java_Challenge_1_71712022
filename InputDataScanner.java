/**
 * Write a complete Java program that prompts the user for two non-negative 
 * integer numbers. 
 * Your program should handle bad input data from keyboard.
 */
package icp_java_week4;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * @author David Ebo Adjepon-Yamoah
 *
 */
public class InputDataScanner {

	/**
	 * Constructor
	 */
	public InputDataScanner() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param args
	 * @throws InputMismatchException
	 */
	public static void main(String[] args) throws InputMismatchException
	{
		//A new scanner class
		//You can pass an object of "FileInputStream("filename.txt")" 
		//to read from file
		//REMEMBER: "System.in" reads data from devices such as a keyboard
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter the first non-negative number: ");
		
		//Assigns the next integer value to the integer variable (i.e. firstNumber)
		int firstNumber = stdin.nextInt();
		
		//Checking for the expected data type 
		if(firstNumber<0) {
			System.out.println("First Number Entered: ["+firstNumber+"] is negative");
			//Note this statement
			System.exit(0);
		}
		//What can you do to improve the code below?
		System.out.print("Enter the second non-negative number: ");
		int secondNumber = stdin.nextInt();
		
		//Checking for the expected data type 
				if(secondNumber<0) {
					System.out.println("Second Number Entered: ["+secondNumber+"] is negative");
					//Note this statement
					System.exit(0);
				}
		System.out.println("You entered numbers " + firstNumber + " and " + 
secondNumber);

		//The Scanner object must be closed 
		stdin.close();
	}

}