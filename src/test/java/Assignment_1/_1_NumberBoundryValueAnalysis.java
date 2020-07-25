package Assignment_1;
/**
 * 
 * @author Sarang
 * This class is for number range validation
 * in comarision with some constant number
 */
public class _1_NumberBoundryValueAnalysis {
	
	public static void main(String[] args) {
		
		String answer = checkNumber(300,300);
		System.out.println("After validation the entered number is found - " + answer);

	}
	
	/**
	 * <h1><b> Comparison of a number </b></h1>
	 * <h2>This method is for comparison of a number</h2>
	 * First parameter is for constant number & 
	 * Second parameter is number to be compared with constant number
	 * @param constantNumber
	 * @param number
	 * @return the comparison result
	 */
	private static String checkNumber(int constantNumber, int number)
	{
		String status;
		if(number<constantNumber)
		{
			status = "less than " + constantNumber;
			return status;
		}
		else if (number>constantNumber) 
		{
			status = "greater than " + constantNumber;
			return status;
		}
		else
		{
			status = "equal to " + constantNumber;
			return status;
		}
	}

}
