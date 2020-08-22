package SeleniumAssignments_6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2_UrlValidation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String Url = "https://demo.cs-cart.com/";
		
		driver.get(Url);
		
		if (driver.getCurrentUrl().contains(Url)) 
		{	
			System.out.println("Correct Url is opened");	
		}
		else 
		{
			System.out.println("Incorrect Url is opened");
		}
		
		driver.quit();

	}

}
