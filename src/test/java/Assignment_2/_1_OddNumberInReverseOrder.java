package Assignment_2;
/**
 * 
 * @author Sarang
 * This class includes different methods
 * to print odd numbers in reverse order
 */
public class _1_OddNumberInReverseOrder {

	public static void main(String[] args) {
		
		int numberFrom = 30;
		int numberTo = 0;
		
		System.out.println("----------- By For Loop ------------------");
		
		// Method 1
		// By using for loop
		System.out.println("Odd number list from : " + numberFrom + " to : " + numberTo + " is");
		for (int i = numberFrom; i >= numberTo; i--) 
		{	
			if(!(i % 2 == 0))
			{
				System.out.print(i + " ");
			}	
		}
		
		System.out.println("\n\n-------------- By While Loop ---------------");
		
		// Method 2
		// By using While Loop
		System.out.println("Odd number list from : " + numberFrom + " to : " + numberTo + " is");
		while(numberFrom>=numberTo)
		{
			if(numberFrom % 2 != 0)
			{
				System.out.print(numberFrom + " ");
			}
			numberFrom--;
		}
	}
}
