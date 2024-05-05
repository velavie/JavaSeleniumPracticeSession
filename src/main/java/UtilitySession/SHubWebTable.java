package UtilitySession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SHubWebTable {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("http://www.selectorshub.com/xpath-practice");

//		driver.get("https://www.espncricinfo.com/series/women-s-premier-league-2023-24-1411373/delhi-capitals-women-vs-up-warriorz-women-4th-match-1417719/full-scorecard");

//		String xpath = "//a[text()='Joe.Root']//ancestor::tr//input[@type='checkbox']";
//		String xpath = "//a[text()='Jasmine.Margan']//ancestor::tr//input[@type='checkbox']";
//		driver.findElement(By.xpath(xpath)).click();

		// click checkboxes - for site 1
		selectUser("Joe.Root");
		selectUser("Jasmine.Morgan");

		// get corresponding details of these Names
		System.out.println(getUserDetails("Jordan.Mathews")); // site 1

//		System.out.println(getUserDetails("Shweta Sehrawat")); //site 2

	}

	// utility
	public static void selectUser(String userName) {
		String xpath = "//a[text()='" + userName + "']//ancestor::tr//input[@type='checkbox']";

		driver.findElement(By.xpath(xpath)).click();
	}

	public static List<String> getUserDetails(String userName) {
		String xpath = "//a[text()='" + userName + "']/parent::td/following-sibling::td";
		// String xpath =
		// "//a[@title='"+userName+"']//span[text()='"+userName+"']//ancestor::tr";
		// --site 2

		List<WebElement> useInfoELes = driver.findElements(By.xpath(xpath));
		List<String> userInfoList = new ArrayList<String>();
		for (WebElement e : useInfoELes) {
			String ColNames = e.getText();
			userInfoList.add(ColNames); // storing the colNames in String ArrayList userInfoList
		}
		return userInfoList;
	}

}
