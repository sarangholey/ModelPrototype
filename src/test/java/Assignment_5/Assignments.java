package Assignment_5;

public class Assignments {

	public static void main(String[] args) {
		
		String str = "I wIlL BeComE A aUtoMatiOn tESTEr";
		String temp[] = str.split(" ");
		String output = "";
		for (int i = 0; i < temp.length; i++) {
			
			//output = output + temp[i].toLowerCase() + " ";
			char[] word = temp[i].toCharArray();
			String test = "";
			for (int j = 0; j < word.length; j++) {
				if(j==0)
				{
				test = test + word[j];
				test = test.toUpperCase();
				}
				else {
					test = test + word[j];
					test = test.toLowerCase();
				}
			}
			output = output + test + " ";
		}
		System.out.println(output);

	}
}

