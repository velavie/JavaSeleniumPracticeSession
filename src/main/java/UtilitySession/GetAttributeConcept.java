package UtilitySession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		// for text--> use getText() method
		// for Attribute--> use getAttribute() method

		// get all the links
		// capture href value

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		
//		String fn_placeholder = driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
//		String fn_name = driver.findElement(By.id("input-firstname")).getAttribute("name");
//		String fn_type = driver.findElement(By.id("input-firstname")).getAttribute("type");
//		
//		System.out.println(fn_placeholder);
//		System.out.println(fn_name);
//		System.out.println(fn_type);		

		By firstname = By.id("input-firstname");

		By registerLink = By.linkText("Register");// to capture the href lin on the page

		String fn_placeholder = doElementGetAttribute(firstname, "placeholder");
		String fn_name = doElementGetAttribute(firstname, "name");
		String fn_type = doElementGetAttribute(firstname, "type");

		String reglink = doElementGetAttribute(registerLink, "href");

		System.out.println("PlaceHolder is: " + fn_placeholder + ", Name: " + fn_name + ", Type: " + fn_type);
		System.out.println("href for Register is: " + reglink);

	}

	// OR Create a utility around it
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static String doElementGetAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

}
