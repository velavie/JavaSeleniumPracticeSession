package UtilitySession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial");

//QQ: In select class object, what do you supply? - 
//Ans: WebElement of the drop down

//		WebElement country = driver.findElement(By.id("Form_getForm_Country"));//WebElement of the dropdown

		// //create the object of select class
//		Select select = new Select(country); //ctrl + space to see the default constructor = element(country)

//		select.selectByIndex(8); //Best for fixed dropdowns like months - not great option as index value can change
//		select.selectByVisibleText("Cameroon");//visible text value
//		select.selectByValue("Nigeria"); //value attribute - may not always be same with 'VisibleText' - can be country code
		// passing wrong values or null - will give NSE exception

		By country = By.id("Form_getForm_Country");

		doSelectByIndex(country, 5);
		doSelectByVisibleText(country, "Cameroon");
		doSelectByValue(country, "Nigeria");

	}
	// Creating a dropdown utility

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static void doSelectByVisibleText(By locator, String visibletext) {
		if (visibletext == null || visibletext.length() == 0) { // null or 0 check
			throw new MyElementException("Visible Text Cannot Be Null");
		}
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibletext);
	}

	public static void doSelectByValue(By locator, String value) {
		if (value == null || value.length() == 0) { // null or 0 check
			throw new MyElementException("Visible Text Cannot Be Null");
		}
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

}
