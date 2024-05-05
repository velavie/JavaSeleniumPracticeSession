package UtilitySession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysWithPause {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		Actions act = new Actions(driver);

		WebElement search = driver.findElement(By.name("search"));

		String value = "macbook";

		char val[] = value.toCharArray(); // convert value 'macbook' to character array

		for (char c : val) { // iterate the character array c
			act.sendKeys(search, String.valueOf(c)).pause(500).build().perform();// supply the values, wait .5 secs
																					// after each char

		}

	}

}
