package UtilitySession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksConcept {

	public static void main(String[] args) {

		// 1. Total link count
		// 2. print the text of each link
		// 3. avoid blank text
		// 4. broken links

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// 1. Find all the elements on the page-->FEs = findElements method
		driver.findElements(By.tagName("a"));
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		System.out.println("Total Links on this page is: " + allLinks.size());

		// 2. print the text of each link
		for (int i = 0; i < allLinks.size(); i++) {
			String text = allLinks.get(i).getText();

			// 3. to remove the blank /empty/hidden links
			if (text.length() != 0) {
				System.out.println(text);
			}
		}
		System.out.println("---------------");

		// OR - Using For loop
		for (WebElement e : allLinks) {
			String text = e.getText();

			// 3a. to remove the blank /empty/hidden links
			if (text.length() != 0) {
				System.out.println(text);
			}

		}
		System.out.println("---------------");

		// to find how many text fields on the page
		driver.findElements(By.className("form-control"));
		List<WebElement> allTextFields = driver.findElements(By.className("form-control"));

		System.out.println("Total Text Fields on this page is: " + allTextFields.size());

//		for(WebElement c : allTextFields) { //wrong concept
//			c.sendKeys("Victor");

	}

}
