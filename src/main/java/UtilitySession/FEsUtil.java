package UtilitySession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FEsUtil {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/gp/bestsellers/?ref_=nav_cs_bestsellers");

		By links = By.tagName("a");
		By images = By.tagName("img");
//			
//			System.out.println("Total page images #: " + getElementsCount(images) );
//			System.out.println("Total page links #: " + getElementsCount(links) );
//			
//			//calling the method below
//			System.out.println("===========================");
//			ArrayList<String> eleTexts =  getElementsTextList(links);
//			System.out.println(eleTexts);

		// calling method
		ArrayList<String> eleAltValues = getElementAttributeList(images, "alt");
		System.out.println(eleAltValues);
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public static ArrayList<String> getElementsTextList(By locator) {
		List<WebElement> elemList = getElements(locator);
		ArrayList<String> elemTextList = new ArrayList<String>();

		for (WebElement e : elemList) {
			String text = e.getText();

			if (text.length() != 0) {
				elemTextList.add(text);
				System.out.println(text);

			}
		}

		return elemTextList;
	}

	public static ArrayList<String> getElementAttributeList(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		ArrayList<String> eleAttrList = new ArrayList<String>();

		for (WebElement e : eleList) {
			String attrValue = e.getAttribute(attrName);

			if (attrValue.length() != 0) {
				eleAttrList.add(attrValue);
			}

		}

		return eleAttrList;
	}

}
