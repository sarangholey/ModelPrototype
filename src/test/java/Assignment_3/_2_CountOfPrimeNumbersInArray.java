package Assignment_3;
/**
 * 
 * @author Sarang
 *
 */
public class _2_CountOfPrimeNumbersInArray {

	public static void main(String[] args) {

		int numbers[] = {2, 5, 6, 8, 11, 14, 17, 18, 20}; 
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (checkNumIsPrime(numbers[i])) {
				count = count + 1;
			}
		}
		System.out.println(count);

	}

	/**
	 * This method is used to check a given
	 * number is prime as parameter and returns
	 * status as true(prime number) or false
	 * (Non prime number)
	 * @param a
	 * @return
	 */
	public static boolean checkNumIsPrime(int a)
	{
		if(a>=2) // Prime Number starts from 2
		{	
			int temp = 0;
			for (int i = 2; i < a-1; i++) {
					if(a % i == 0)
					{
						temp = temp + 1;
					}
			}
			if(temp==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else {
			return false;
		}
	}

}
