package Assignment_1;
/**
 * 
 * @author Sarang
 * This class is for number to
 * Day convention
 */
public class _4_NumberToDay {

	public static void main(String[] args) {
		
		// Method 1
		String dayName = numberToDayConvertion(4);
		System.out.println("The day associated with entered number is :- " + dayName);

		System.out.println("------------------------");
		
		// Method 2
		String DayName = daysInWeekConverter(4);
		System.out.println("The day associated with entered number is :- " + DayName);
		
	}
	
	/**
	 * This method returns the Day with
	 * comparing to the enter number as parameter
	 * By using Switch case statement
	 * @param number
	 * @return dayName
	 */
	private static String numberToDayConvertion(int number)
	{
		switch (number) {
		case 1:
			return "MONDAY";
		case 2:
			return "TUESDAY";
		case 3:
			return "WEDNESDAY";
		case 4:
			return "THUSDAY";
		case 5:
			return "FRIDAY";
		case 6:
			return "SATURDAY";
		case 7:
			return "SUNDAY";
		default:
			return "Error, Please enter the number betwwen 1 to 7 only";
		}
	}
	
	/**
	 * This method returns the Day with
	 * comparing to the enter number as parameter
	 * By using if else block statement
	 * @param number
	 * @return DayName
	 */
	private static String daysInWeekConverter(int number)
	{
		if (number == 1) {
			return "MONDAY";
		} 
		if (number == 2) {
			return "TUESDAY";
		}
		if (number == 3) {
			return "WEDNESDAY";
		}
		if (number == 4) {
			return "THUSDAY";
		}
		if (number == 5) {
			return "FRIDAY";
		}
		if (number == 6) {
			return "SATURDAY";
		}
		if (number == 7) {
			return "SUNDAY";
		}else {
			return "Error, Please enter the number betwwen 1 to 7 only";
		}
	}

}
