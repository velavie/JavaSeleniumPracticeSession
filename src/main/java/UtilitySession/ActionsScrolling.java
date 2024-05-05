package UtilitySession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// sel 4.x:
		driver = new ChromeDriver();
		// driver.get("https://naveenautomationlabs.com/opencart/");
		driver.get("https://amazon.in");

		Actions act = new Actions(driver);

		Thread.sleep(1000);
		act.sendKeys(Keys.PAGE_DOWN).perform();// --'Keys' has predefined eNum/keyboard values in Selenium. eNum is a..
		Thread.sleep(1000);
		act.sendKeys(Keys.PAGE_UP).perform();

		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();// Keyboard action - scroll down/page bottom
		Thread.sleep(1000);
		act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform(); // Keyboard action - scroll down/page top
		Thread.sleep(1000);
		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();

		act.scrollToElement(driver.findElement(By.xpath("//a[text()='Delivery Information']")))
				.click(driver.findElement(By.xpath("//a[text()='Delivery Information']"))).build().perform();

	}

}
