package Assignment_2;

import java.util.Scanner;

/**
 * 
 * @author Sarang
 * This class holds up method
 * to print a particular car specification
 * according to user input with the car model
 * name. By using Switch case & String Array
 */
public class _4_CarModelsData_1 {

	public static void main(String[] args) {
		
		// Instruction message to user
		System.out.println("Select a number associated with car brand name to get the details of a car");
		System.out.println("For Honda enter : 1");
		System.out.println("For Tata enter : 2");
		System.out.println("For Maruti enter : 3");
		System.out.println("For Scoda enter : 4");
		
		// Fetching input from user
		Scanner scan = new Scanner(System.in);
		int userInput = scan.nextInt();
		
		// Creating an String array to store the car details
		String carDetails[] = new String[5];
		
		// Storing the car details as per user input in String array
		for (int i = 0; i < carDetails.length; i++) {
			carDetails[i] = carSpefication(userInput)[i];
		}
		
		// Printing the stored details of car as per user input
		for (int i = 0; i < carDetails.length; i++) {
			System.out.println(carDetails[i]);
		}
		scan.close();
	}
	
	/**
	 * This method holds up different car details
	 * & specifications and returns array of String 
	 * with selected car details on the basis
	 * of integer input as parameter
	 * @param carModelNo
	 * @return String[]
	 */
	public static String[] carSpefication(int carModelNo)
	{
		switch (carModelNo) {
		case 1:
			String carDetails1[] = new String[5];
			carDetails1[0] = "Brand Name - Honda";
			carDetails1[1] = "Model Name - Amaze";
			carDetails1[2] = "Colour - Perl White";
			carDetails1[3] = "Mileage - 23 Kmpl";
			carDetails1[4] = "Price - 8.25 Lac";
			return carDetails1;
		case 2:
			String carDetails2[] = new String[5];
			carDetails2[0] = "Brand Name - Tata";
			carDetails2[1] = "Model Name - Hexa";
			carDetails2[2] = "Colour - Racing red";
			carDetails2[3] = "Mileage - 19 Kmpl";
			carDetails2[4] = "Price - 9.45 Lac";
			return carDetails2;
			
		case 3:
			String carDetails3[] = new String[5];
			carDetails3[0] = "Brand Name - Maruti";
			carDetails3[1] = "Model Name - Alto";
			carDetails3[2] = "Colour - Ocean Blue";
			carDetails3[3] = "Mileage - 25 Kmpl";
			carDetails3[4] = "Price - 5.50 Lac";
			return carDetails3;
		case 4:
			String carDetails4[] = new String[5];
			carDetails4[0] = "Brand Name - Scoda";
			carDetails4[1] = "Model Name - Rapid";
			carDetails4[2] = "Colour - Sterling Black";
			carDetails4[3] = "Mileage - 16 Kmpl";
			carDetails4[4] = "Price - 11.30 Lac";
			return carDetails4;
		default:
			String carDetails5[] = new String[5];
			carDetails5[0] = "Invalid Input";
			carDetails5[1] = "Enter 1 for Honda";
			carDetails5[2] = "Enter 2 for Tata";
			carDetails5[3] = "Enter 3 for Maruti";
			carDetails5[4] = "Enter 4 for Scoda";
			return carDetails5;
		}
	}

}
