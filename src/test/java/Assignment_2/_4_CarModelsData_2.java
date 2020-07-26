package Assignment_2;

import java.util.Scanner;
/**
 * 
 * @author Sarang
 * This class holds up method
 * to print a particular car specification
 * according to user input with the car model
 * name. By using Switch case & static methods
 */
public class _4_CarModelsData_2 {

	public static void main(String[] args) {
	
		// Instruction message to user
		System.out.println("Select a number associated with car brand name to get the details of a car");
		System.out.println("For Honda enter : 1");
		System.out.println("For Tata enter : 2");
		System.out.println("For Maruti enter : 3");
		System.out.println("For Scoda enter : 4");
		
		// Fetching input from user & printing the selected car details
		Scanner scanUserInput = new Scanner(System.in);
		int SelectionNumber = scanUserInput.nextInt();
		scanUserInput.close();
		switch (SelectionNumber) {
		case 1:
			honda();
			break;
		case 2:
			tata();
			break;
		case 3:
			maruti();
			break;
		case 4:
			scoda();
			break;
		default:
			System.out.println("Please enter a input from 1 to 4");
			break;
		}
	}
	
	public static void honda()
	{
		System.out.println("Brand Name - Honda");
		System.out.println("Model Name - Amaze");
		System.out.println("Colour - Perl White");
		System.out.println("Mileage - 23 Kmpl");
		System.out.println("Price - 8.25 Lac");
	}
	
	public static void tata()
	{
		System.out.println("Brand Name - Tata");
		System.out.println("Model Name - Hexa");
		System.out.println("Colour - Racing red");
		System.out.println("Mileage - 19 Kmpl");
		System.out.println("Price - 9.45 Lac");
	}
	
	public static void maruti()
	{
		System.out.println("Brand Name - Maruti");
		System.out.println("Model Name - Alto");
		System.out.println("Colour - Ocean Blue");
		System.out.println("Mileage - 25 Kmpl");
		System.out.println("Price - 5.50 Lac");
	}
	
	public static void scoda()
	{
		System.out.println("Brand Name - Scoda");
		System.out.println("Model Name - Rapid");
		System.out.println("Colour - Sterling Black");
		System.out.println("Mileage - 16 Kmpl");
		System.out.println("Price - 11.30 Lac");
	}

	
}

