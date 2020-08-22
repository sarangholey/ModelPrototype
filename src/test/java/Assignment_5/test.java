package Assignment_5;

public class test {
	public static void main(String[] args) {

		 String str="#%$#%$*!!Hello there *&*&%$%$^ good";
		 
		 
		String resultStr="";  

		for (int i=0;i<str.length();i++)  
		{  

		if (str.charAt(i)>64 && str.charAt(i)<=122)
		{  
		  
		resultStr=resultStr+str.charAt(i);  
		}  
		}  
		System.out.println("String after removing special characters is:"+resultStr);

		  }
}
