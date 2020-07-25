package Assignment_2;
/**
 * 
 * @author Sarang
 * This class includes different methods
 * to print odd numbers total 
 * From a given particular range
 */
public class _3_CountOfOddNumbers {

	public static void main(String[] args) {

		int numberFrom = 0;
		int numberTo = 20;

		System.out.println("----------- By For Loop ------------------");
		System.out.println("Total for all odd numbers from "+numberFrom+" to number "+numberTo+" is : " + oddNumberTotalSum(numberFrom, numberTo));

		System.out.println("\n----------- By While Loop ------------------");
		System.out.println("Total for all odd numbers from "+numberFrom+" to number "+numberTo+" is : " + OddNumberTotalSumCalc(numberFrom, numberTo));

	}

	// Method 1
	// By using for loop
	public static int oddNumberTotalSum(int fromNumber, int toNumber)
	{
		int totalSum = 0;
		for (int i = fromNumber; i <= toNumber; i++) {

			if(i % 2 != 0)
			{
				totalSum = totalSum + i;
			}	
		}
		return totalSum;
	}

	// Method 2
	// By using While loop
	public static int OddNumberTotalSumCalc(int fromNumber, int toNumber)
	{
		int totalSum = 0;
		while (fromNumber<=toNumber) {
			if(fromNumber % 2 != 0)
			{
				totalSum = totalSum + fromNumber;
			}
			fromNumber++;
		}
		return totalSum;
	}

}
