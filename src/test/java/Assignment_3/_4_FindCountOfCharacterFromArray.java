package Assignment_3;
/**
 * 
 * @author Sarang
 * This class hold up the 
 * method to find duplicate character
 * in a char array
 */
public class _4_FindCountOfCharacterFromArray {

	public static void main(String[] args) {
		
		char alphabets[] = {'I', 'a', 'm', 'A', 'j', 'a', 'v', 'a', 'Q', 'A'}; 
		int count = 0;
		for (int i = 0; i < alphabets.length; i++) {
			if (checkChar('A', alphabets[i])) {
				count = count + 1;
			}
		}
		System.out.println("The count value of alphabet A in given character array is : " + count);
		
	}
	
	/**
	 * This method returns true
	 * if constant character matches with
	 * charToFind present in lowser case or 
	 * in Upper case
	 * @param constant
	 * @param charToFind
	 * @return
	 */
	public static boolean checkChar(char constant ,char charToFind)
	{
		Character charNumber = new Character(constant);
		int upperCase = charNumber.toUpperCase(constant);
		int lowserCase = charNumber.toLowerCase(constant);
		if(upperCase == charToFind || lowserCase == charToFind)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
