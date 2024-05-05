package UtilitySession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayed {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// 1st logo has a unique class - CTRL +F, .img-responsive(.classname)
//		Boolean logoDisplayed = driver.findElement(By.className("img-responsive233")).isDisplayed();
//		//if className is wrong, NSE is thrown without getting to the if statement--Not good
//
//		System.out.println(logoDisplayed);
//		if(logoDisplayed) {
//		System.out.println("Logo is displayed----PASS");
//		}else {
//			System.out.println("Logo is NOT displayed---FAIL");
//		}

//		By logo = By.className("img-responsive");

		// calling isElementDisplayed method
//		if(isElementDisplayed(logo)) {
//			System.out.println("Logo is displayed----PASS");
//		}else {
//			System.out.println("Logo is NOT displayed---FAIL");
//		}

		// OR - - better
//		List<WebElement> logo = driver.findElements(By.className("img-responsive"));
//
//		if (logo.size() == 1) { // Only if 1 image is displayed on page
//			System.out.println("Logo is displayed----PASS");
//		} else {
//			System.out.println("Logo is NOT displayed----FAIL");
//		}

		By logo = By.className("img-responsive00");

		if (isElementExist(logo)) {
			System.out.println("Logo is displayed----PASS");
		} else {
			System.out.println("Logo is NOT displayed---FAIL");
		}

	}

	private static boolean isMultiElementExist(By locator) {
		if (getElements(locator).size() > 0) {
			return true;
		}
		return false;
	}

	private static boolean isElementExist(By locator) {
		if (getElements(locator).size() == 1) {
			return true;
		}
		return false;
	}

	private static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static boolean isElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

}
