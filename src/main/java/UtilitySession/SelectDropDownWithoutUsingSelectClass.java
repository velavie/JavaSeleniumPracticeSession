package UtilitySession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropDownWithoutUsingSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {

		// Not allowed to use select class, then select value from drop down

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial");

		By options = By.xpath("//select[@id='Form_getForm_Country']/option");

		doWithoutSelectValueFromDropDown(options, "Nigeria");
		doWithoutSelectValueFromDropDown(options, "Zimbabwe");
		//
	}

//		System.out.println(optionsList.size());

//		for(WebElement e : optionsList) {
//			String text =  e.getText();
//			
//			if(text.equals("Nigeria")) {
//				e.click();
//				break;
//			}
//			System.out.println(text);
//		}
//		

	public static void doWithoutSelectValueFromDropDown(By locator, String value) {// print only
		List<WebElement> OptionsList = driver.findElements(locator);
		System.out.println(OptionsList.size());
		for (WebElement e : OptionsList) {
			String text = e.getText();
			if (text.equals(value)) {
				e.click();
				break;
			}
		}
	}
}
