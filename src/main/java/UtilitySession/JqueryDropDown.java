package UtilitySession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JqueryDropDown {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");

		Thread.sleep(3000);

		By dropDown = By.id("justAnInputBox");
		By choices = By.xpath("//span[@class='comboTreeItemTitle']");

		// 1. TC_01 - single selection - Pass
		// selectChoice(dropDown, choices, "choice 1");

		// 2. TC_02 - multi selection - Pass
		// selectChoice(dropDown, choices, "choice 1", "choice 2 3", "choice 3", "choice
		// 6 2 3", "choice 7"); //'...' allows n # of values

		// 3. TC_All Selection
		selectChoice(dropDown, choices, "all");

//		... varargs --Spread parameter(JS) --array

//		Thread.sleep(3000);	
//		List<WebElement> selList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));	
//		System.out.println(selList.size());

//		for(WebElement e : selList) {
//			String text = e.getText();		
//			System.out.println(text);		
//			if(text.equals("choice 1")) {
//				e.click();
//				break;
//			}
//		}
	}

	/**
	 * This is 3 scenarios - single, multiple and all. please supply "all" in all
	 * selection
	 * 
	 * @param dropDownlocator
	 * @param choices
	 * @param value
	 * @throws InterruptedException
	 */
	public static void selectChoice(By dropDownlocator, By choices, String... value) throws InterruptedException { // ...

		driver.findElement(dropDownlocator).click();

		Thread.sleep(3000);

		List<WebElement> choicesList = driver.findElements(choices);

		if (!value[0].equals("all")) { // makes the statement false and jumps to 'else' section

			System.out.println(choicesList.size());

			for (WebElement e : choicesList) {

				String text = e.getText();
				System.out.println(text);

				for (String val : value) {
					if (text.equals(val)) {
						e.click();
					}
				}
			}
		} else {
			// 'all' sections logic
			for (WebElement e : choicesList) {
				try {
					e.click(); // click on all the checkboxes
				} catch (ElementNotInteractableException el) {// throws exception after 14
					break;
				}
			}
		}
	}
}
