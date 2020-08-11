package SeleniumAssignments._2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_FormFillingAndValidation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/text-box");

		WebElement fullNameTextBox = driver.findElement(By.id("userName"));
		fullNameTextBox.sendKeys("Harry Joe");

		WebElement userEmailId = driver.findElement(By.id("userEmail"));
		userEmailId.sendKeys("harryjoe@gmail.com");

		WebElement formSubmitButton = driver.findElement(By.id("submit"));
		formSubmitButton.click();

		WebElement nameEntry = driver.findElement(By.id("name"));
		String nameText = nameEntry.getText();
		System.out.println(nameText);

		WebElement emailEntry = driver.findElement(By.id("email"));
		String emailText = emailEntry.getText();
		System.out.println(emailText);

		String[] text = nameText.split(":");
		String[] email = emailText.split(":");
		
		System.out.println("User's Name is : " + text[1] + " " + "User's Email ID is : " + email[1]);

		if (text[1].equals("Harry Joe") && email[1].equals("harryjoe@gmail.com")) {

			System.out.println("Correct");

		} else {

			System.out.println("Incorrect");

		}

	}

}

