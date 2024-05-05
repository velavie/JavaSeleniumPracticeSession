package UtilitySession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsStrategy {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// Formula: Find a webelement + perfom an action - click, gettext, sendKeys,
		// isDisplyed etc

		// Locators:
		// id: 'driver.findElement.By.id' seen so far

		// 1. By.id: unique attribute: cannot be duplicated
//		driver.findElement(By.id("input-email")).sendKeys("victor@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("victor123");

		// 2. By.name: can be duplicated -- 2nd
//		driver.findElement(By.name("firstname")).sendKeys("victor");
//		driver.findElement(By.name("lastname")).sendKeys("kojack");

		// can use By locator here with By.name - Same as #6 in LocatorsConcept class
//		By fn = By.name("firstname");
//		By ln = By.name("lastname");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(fn, "test");
//		eleUtil.doSendKeys(ln, "automation");

		// 3. By.className: its not a unique attribute, can be duplicated - 3rd
		// driver.findElement(By.className("form-control")).sendKeys("testing");

		// 4. By.xpath: its not an attribute: address of the webelement in HTML DOM
		// XML PATH
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("testing");
//		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("automation");

		// can use By locator here with By.xpath - Same as #6 in LocatorsConcept class
//		By fn = By.xpath("//*[@id=\"input-firstname\"]");
//		By ln = By.xpath("//*[@id=\"input-lastname\"]");

//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(fn, "testing");
//		eleUtil.doSendKeys(ln, "automation");

		// 5. By.css: cascaded style sheet: its not an attribute:
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("testing");
//		driver.findElement(By.cssSelector("#input-lastname")).sendKeys("automation");

		// 6. linkText: only for links : for the text of the link
		// html dom: <a> -- link
		// driver.findElement(By.linkText("Login")).click();

//		By loginLink = By.linkText("Login");
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doClick(loginLink);

		// 7. partialLinkText: only for links : for the partial text of the link

//		driver.findElement(By.partialLinkText("Forgotten")).click();

		// Forgotten username
		// Forgotten password

		// 8. tagName:html tag:
//		String header = driver.findElement(By.tagName("h1")).getText();
//		System.out.println(header);

		By pageHeader = By.tagName("h1");
		ElementUtil eleUtil = new ElementUtil(driver);
		String header = eleUtil.doGetElementText(pageHeader);
		System.out.println(header);

	}

}
