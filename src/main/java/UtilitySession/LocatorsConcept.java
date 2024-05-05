package UtilitySession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// Formula: Find a webelement + perfom an action - click, gettext, sendKeys,
		// isDisplyed etc

		// 1.
//		driver.findElement(By.id("input-email")).sendKeys("victor@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("victor123");

		// 2.
//		WebElement emaild = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		emaild.sendKeys("vtest@gmail.com");
//		password.sendKeys("victor123");

		// 3. By Locator - approach
//		By username = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		WebElement emailid = driver.findElement(username);
//		WebElement password = driver.findElement(pwd);
//		
//		emailid.sendKeys("ajilo@gmail.com");
//		password.sendKeys("jilo123");

		// 4. By Locator with some utility
//		By username = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		WebElement emailid =  getElement(username);
//		WebElement password =  getElement(pwd);
//		
//		emailid.sendKeys("fomad@gmail.com");
//		password.sendKeys("fomad123");

		// 5. By locator with Element Util + Action Util
		// trying to eliminate "sendkeys"
//		By username = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		doSendKeys(username, "agu@321");
//		doSendKeys(pwd, "agu123");

		// **6. By locator + create a common utility class for elements 'ElementUtil'
		// Class
		// By Locators = OR: Object Repository - QTP
//		By username = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(username, "akwaugo@gmail.com");
//		eleUtil.doSendKeys(pwd, "victor123");

		// 7. By Locator + Combining ElementUtil and BrowserUtil

		// 8. By Utility + String locators - to eliminate 'By' class
		String username_id = "input-email";
		String pwd_id = "input-password";

		ElementUtil eleUtil = new ElementUtil(driver);

		eleUtil.doSendKeys("id", username_id, "anandy@gmail.com");
		eleUtil.doSendKeys("id", pwd_id, "Audity@123");
		// driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();

//		Conclusion - Concepts
		// string --> by --> webelement -- action -- 2nd
		// by -- webelement --action -- Ist
		// webelement -- action -- 3rd

	}
	// for #4 and #5
	// Create WebElement here - with a ReUsable method/function - getElement
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}
//	
//	//for #5
//	public static void doSendKeys(By locator, String value) {
//		getElement(locator).sendKeys(value);
//	}

}
