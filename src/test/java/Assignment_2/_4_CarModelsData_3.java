package Assignment_2;

import java.util.Scanner;
/**
 * 
 * @author Sarang
 * This class holds up method
 * to print a particular car specification
 * according to user input with the car model
 * name. By using if else & non static methods
 */
public class _4_CarModelsData_3 {

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

		if (SelectionNumber == 1) 
		{
			_4_CarModelsData_3 carDetails = new _4_CarModelsData_3();
			System.out.println(carDetails.honda());
		}
		else if (SelectionNumber == 2)
		{
			_4_CarModelsData_3 carDetails = new _4_CarModelsData_3();
			System.out.println(carDetails.tata());
		}
		else if (SelectionNumber == 3)
		{
			_4_CarModelsData_3 carDetails = new _4_CarModelsData_3();
			System.out.println(carDetails.maruti());
		}
		else if (SelectionNumber == 4)
		{
			_4_CarModelsData_3 carDetails = new _4_CarModelsData_3();
			System.out.println(carDetails.scoda());
		}
		else
		{
			System.out.println("Please enter a input from 1 to 4");
		}
	}
	public String honda()
	{
		String hondaCarDetails = "Brand Name - Honda\n"
				+ "Model Name - Amaze\n"
				+ "Colour - Perl White\n"
				+ "Mileage - 23 Kmpl\n"
				+ "Price - 8.25 Lac";
		return hondaCarDetails;
	}

	public String tata()
	{
		String tataCarDetails = "Brand Name - Tata\n"
				+ "Model Name - Hexa\n"
				+ "Colour - Racing red\n"
				+ "Mileage - 19 Kmpl\n"
				+ "Price - 9.45 Lac";
		return tataCarDetails;
	}

	public String maruti()
	{
		String marutiCarDetails = "Brand Name - Maruti\n"
				+ "Model Name - Alto\n"
				+ "Colour - Ocean Blue\n"
				+ "Mileage - 25 Kmpl\n"
				+ "Price - 5.50 Lac";
		return marutiCarDetails;
	}

	public String scoda()
	{
		String scodaCarDetails = "Brand Name - Scoda\n"
				+ "Model Name - Rapid\n"
				+ "Colour - Sterling Black\n"
				+ "Mileage - 16 Kmpl\n"
				+ "Price - 11.30 Lac";
		return scodaCarDetails;
		
	}


}
