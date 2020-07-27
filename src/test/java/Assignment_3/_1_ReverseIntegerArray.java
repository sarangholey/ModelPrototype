package Assignment_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * 
 * @author Sarang
 * This class contains the different
 * methods to reverse an integer array
 */
public class _1_ReverseIntegerArray {

	public static void main(String[] args) {

		System.out.println("------------------------- By using for loop -----------------------------------");
		// Method 1 [Logic based]
		// By using for loop
		int num[] = {11, 22, 33, 44, 55};

		int startIndex = 0;
		int endIndex = num.length-1;
		int temp = 0;

		System.out.print("Before Swaping array contains values as : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		// By using for loop
		for (int i = 0; i < (num.length)/2; i++) {
			temp = num[startIndex];
			num[startIndex] = num[endIndex];
			num[endIndex] = temp;
			startIndex++;
			endIndex--;
		}

		System.out.print("\nAfter Swaping array contains values as : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

		System.out.println("\n-----------------------------------------------------------------------------");
		System.out.println("\n-------------------------- By using while loop ------------------------------");	
		// Method 2 [Logic based]
		// By using while loop
		int number[] = {11, 22, 33, 44, 55};

		int startIndexNo = 0;
		int endIndexNo = num.length-1;
		int tempVariable = 0;
		
		System.out.print("Before Swaping array contains values as : ");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
		
		while(startIndexNo < endIndexNo)
		{
			tempVariable = number[startIndexNo];
			number[startIndexNo] = number[endIndexNo];
			number[endIndexNo] = tempVariable;
			startIndexNo++;
			endIndexNo--;
		}
		
		System.out.print("\nAfter Swaping array contains values as : ");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
		
		System.out.println("\n-----------------------------------------------------------------------------");
		System.out.println("\n--------------------------  Using List ---------------------------------------");	
		// Method 3 [Inbuilt Java functions/methods]
		// Using List
		Integer numbers[] = {11, 22, 33, 44, 55};
		System.out.print("Before Swaping array contains values as : ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		List<Integer> numberList = Arrays.asList(numbers);
		Collections.reverse(numberList);
		numberList.toArray(numbers);
	
		System.out.print("\nAfter Swaping array contains values as : ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
	}

}
