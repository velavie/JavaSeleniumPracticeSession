package UtilitySession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		// driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		driver.get("https://www.spicejet.com");

		// hidden DOM element
//		WebElement content = driver.findElement(By.className("menulink"));
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(content).perform(); //now submenu becomes visible
		// act.moveToElement(content).build().perform();
		// 1 - perform
		// 1 - build.perform
		// n - build + perform

		// Thread.sleep(2000);
		// driver.findElement(By.linkText("ARTICLES")).click(); //OR
		// driver.findElement(By.xpath("//a[contains(text(),'Articles')]")).click();

		// http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html
		// By parent = By.className("menulink");
		// By subMenu = By.linkText("ARTICLES");

		// https://www.spicejet.com
		By parent = By.xpath("//div[text()='Add-ons']");
		By subMenu = By.xpath("//div[text()='Zero Cancellation']");

		handleMenuandSebMenu(parent, subMenu);

	}
	// utility - any site - for 2 level Menus

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void handleMenuandSebMenu(By parentMenuLocator, By SubMenuLocator) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenuLocator)).perform();
		Thread.sleep(2000);
		driver.findElement(SubMenuLocator).click();

	}

}
