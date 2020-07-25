package Assignment_2;
/**
 * 
 * @author Sarang
 * This class includes different methods
 * to print even numbers total 
 * From a given particular range
 */
public class _2_SumOfEvenNumbers {

	public static void main(String[] args) {

		int numberFrom = 0;
		int numberTo = 15;

		System.out.println("----------- By For Loop ------------------");
		System.out.println("Total for all even numbers from "+numberFrom+" to number "+numberTo+" is : " + evenNumberCountSum(numberFrom, numberTo));
		
		System.out.println("\n----------- By While Loop ------------------");
		System.out.println("Total for all even numbers from "+numberFrom+" to number "+numberTo+" is : " + evenNumberTotalSumCalc(numberFrom, numberTo));
	}

	// Method 1
	// By using for loop
	public static int evenNumberCountSum(int fromNumber, int toNumber)
	{
		int totalSum = 0;
		for (int i = fromNumber; i <= toNumber; i++) {

			if(i % 2 == 0)
			{
				totalSum = totalSum + i;
			}	
		}
		return totalSum;
	}
	
	// Method 2
	// By using While loop
	public static int evenNumberTotalSumCalc(int fromNumber, int toNumber)
	{
		int totalSum = 0;
		while (fromNumber<=toNumber) {
			if(fromNumber % 2 == 0)
			{
				totalSum = totalSum + fromNumber;
			}
			fromNumber++;
		}
		return totalSum;
	}
}
