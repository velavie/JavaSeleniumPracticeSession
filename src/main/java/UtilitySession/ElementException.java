package UtilitySession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementException {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");

		// String elem = driver.findElement(By.name("Ndu")).sendKeys("Computer");
		// NoSuchElementException thrown

		List<WebElement> elemS = driver.findElements(By.tagName("victor"));
		// Empty array list - 0: No exception thrown
		System.out.println(elemS.size()); // size = 0
		System.out.println(elemS); // [] empty arraylist
	}

}
