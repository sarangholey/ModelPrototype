package Assignment_1;
/**
 * 
 * @author Sarang
 * This is a basic tax calculation
 * example
 */
public class _2_TaxCalculation {

	public static void main(String[] args) {

		double billAfterTax = taxImpose(10.100);
		System.out.println("After tax calculation the final bill is : " + billAfterTax);
		
	}
	
	/**
	 * <h1>This methods is to calculate the finalbill</h1>
	 * with addition of tax to the bill amount. It 
	 * returns finalbill with tax included & accepts
	 * parameter as bill amount
	 * @param billAmount
	 * @return billWithTax
	 */
	private static double taxImpose(double billAmount) {
		
		if (billAmount <= 300) 
		{
			if (billAmount <= 0) 
			{
				return 0.0;
			}
			else {
				double billWithTax = billAmount + 50;
				return billWithTax;
			}		
		}
		if (billAmount > 300 && billAmount <= 500) 
		{
			double billWithTax = billAmount + 20;
			return billWithTax;
			
		}
		if (billAmount > 500 && billAmount <= 1000) 
		{
			double billWithTax = billAmount + 10;
			return billWithTax;
			
		}
		// condition for more bill amount more than 1000
		else {
			return billAmount;
		}
	}

}
