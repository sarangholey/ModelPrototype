package SeleniumAssignments_6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_TitleValidation {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in");
		
		String expectedPageTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		if (driver.getTitle().equals(expectedPageTitle)) 
		{	
			System.out.println("Page title is correct");
		}
		else 
		{
			System.out.println("Page title is incorrect");
		}
		
		driver.quit();

	}

}
