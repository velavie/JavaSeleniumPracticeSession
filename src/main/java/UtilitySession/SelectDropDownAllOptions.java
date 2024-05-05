package UtilitySession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllOptions {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial");

		By country = By.id("Form_getForm_Country");

		doSelectAllDropDownValue(country, "Nigeria");

//		WebElement country = driver.findElement(By.id("Form_getForm_Country"));
//		
//		Select select = new Select(country);
//		
//		List<WebElement> countryOptions = select.getOptions(); //select all the drop down options
//		
//		System.out.println(countryOptions.size());
//		
//		for(WebElement e : countryOptions) {
//			String text = e.getText();   //get all the countries and print each
//			
//			if(text.equals("Niger")) {  //if option becomes Nigeria, select it to display & stop
//				e.click();
//				break;
//			}
//			
//			System.out.println(text);
//		}

	}

	public static List<String> doGetDropDownOptionsTextList(By locator) {// get List of string
		List<WebElement> optionsList = doGetDropDownOptionsList(locator);
		List<String> optionsTextList = new ArrayList<String>();
		for (WebElement e : optionsList) {
			String optionsText = e.getText(); // get all the countries and print each
			optionsTextList.add(optionsText);
		}
		return optionsTextList;
	}

	public static List<WebElement> doGetDropDownOptionsList(By locator) {// get list of webelements
		WebElement country = driver.findElement(locator);
		Select select = new Select(country);
		return select.getOptions();
	}

	public static int doGetDropDownValuesCount(By locator) { // get count
		return doGetDropDownOptionsList(locator).size();
	}

	public static void doSelectAllDropDownValue(By locator, String value) {// select a specific option
		List<WebElement> OptionsList = doGetDropDownOptionsList(locator);
		for (WebElement e : OptionsList) {
			String text = e.getText(); // get all the countries and print each
			System.out.println(text);

			if (text.equals(value)) { // if option becomes 'Nigeria', select it to display & stop
				e.click();
				break;
			}
		}
	}

	public static void printSelectAllDropDownValue(By locator) {// print only
		List<WebElement> OptionsList = doGetDropDownOptionsList(locator);
		for (WebElement e : OptionsList) {
			String text = e.getText();
			System.out.println(text);
		}
	}

}
