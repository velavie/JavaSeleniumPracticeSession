package UtilitySession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTabSequence {

	static WebDriver driver;

	public static void main(String[] args) {
		// Accessibility Testing - using keyboard actions to tab actions across fields
		// instead hitting the tab key

		driver = new ChromeDriver();

		// driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.get("https://amazon.com");

		Actions act = new Actions(driver);

		// "https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		WebElement search = driver.findElement(By.name("firstname"));				
//		act.sendKeys(search, "sanjay")
//			.sendKeys(Keys.TAB)
//			.pause(200)
//			.sendKeys("automation")
//			.sendKeys(Keys.TAB)
//			.pause(200)
//			.sendKeys("san@gmail.com")
//			.sendKeys(Keys.TAB)
//			.pause(200)
//			.sendKeys("99999999")
//			.sendKeys(Keys.TAB)
//			.pause(200)
//			.sendKeys("san@123")
//			.sendKeys(Keys.TAB)
//			.pause(200)
//			.sendKeys("san@123")
//			.build().perform();

//		OR

		// "https://www.amazon.com");
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
				.sendKeys("macbook pro")// 5 tab actions before entering text
				.sendKeys(Keys.ENTER).build().perform();

	}

}
