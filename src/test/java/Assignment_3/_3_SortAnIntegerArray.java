package Assignment_3;

import java.util.Arrays;
/**
 * 
 * @author Sarang
 *
 */
public class _3_SortAnIntegerArray {

	public static void main(String[] args) {
		
		int numbers[] = {20, 14, 48, 9, 5, 3, 25, 7}; 
		
		// Method 1
		// By using inbuilt function/method in Arrays class
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println("\n---------------------------\n");
		
		// Method 2
		// By own swapping logic
		int numbers1[] = {20, 14, 48, 9, 5, 3, 25, 7};
		for (int i = 0; i < numbers1.length; i++) {
			for (int j = (i+1); j < numbers1.length; j++) {
				if(numbers1[i] > numbers1[j])
				{
					int temp = numbers1[i];
					numbers1[i] = numbers1[j];
					numbers1[j] = temp;
				}
			}
			
		}
		for (int i = 0; i < numbers1.length; i++) {
			System.out.print(numbers1[i] + " ");
		}
		
	}

}
