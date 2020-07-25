package Assignment_1;
/**
 * 
 * @author Sarang
 * This class is for number to
 * word convention
 */
public class _3_NumberToWord {

	public static void main(String[] args) {
		
		// Method 1
		String wordNumber = numberToWordConvertion(1);
		System.out.println("The entered number in words as : " + wordNumber);
		
		System.out.println("------------------------");
		
		// Method 2
		String WordNumber = NumberToWord(5);
		System.out.println("The entered number in words as : " + WordNumber);
	}

	
	/**
	 * This method returns the Day with
	 * comparing to the enter number as parameter
	 * By using Switch case statement
	 * @param number
	 * @return dayName
	 */
	private static String numberToWordConvertion(int number)
	{
		switch (number) {
		case 0:
			return "Zero";
		case 1:
			return "One";
		case 2:
			return "Two";
		case 3:
			return "Three";
		case 4:
			return "Four";
		case 5:
			return "Five";
		case 6:
			return "Six";
		case 7:
			return "Seven";
		case 8:
			return "Eight";
		case 9:
			return "Nine";
		default:
			return "Error, Please enter the number betwwen 0 to 9 only";
		}
	}
	
	/**
	 * This method returns the Day with
	 * comparing to the enter number as parameter
	 * By using if else block statement
	 * @param number
	 * @return dayName
	 */
	private static String NumberToWord(int number)
	{
		if (number == 0) {
			return "Zero";
		}
		if (number == 1) {
			return "One";
		} 
		if (number == 2) {
			return "Two";
		}
		if (number == 3) {
			return "Three";
		}
		if (number == 4) {
			return "Four";
		}
		if (number == 5) {
			return "Five";
		}
		if (number == 6) {
			return "Six";
		}
		if (number == 7) {
			return "Seven";
		}
		if (number == 8) {
			return "Eight";
		}
		if (number == 6) {
			return "Nine";
		}
		else {
			return "Error, Please enter the number betwwen 0 to 9 only";
		}
	}
}
