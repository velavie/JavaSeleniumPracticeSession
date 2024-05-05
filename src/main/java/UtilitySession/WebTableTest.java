package UtilitySession;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();

		driver.get("https://classic.crmpro.com");

		driver.findElement(By.name("username")).sendKeys("Apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		Thread.sleep(3000);

		driver.switchTo().frame("mainpanel");

		driver.findElement(By.linkText("CONTACTS")).click();

		Thread.sleep(5000);

		getSelectCheckbox("Joe Root");
		String contName = getContactName("Joe Root");
		System.out.println(contName);

		String compName = getCompanyName("Joe Root");
		System.out.println(compName);

		String phNum = getPhoneNumber("Joe Root");
		System.out.println(phNum);

		String emailAd = getEmailAddress("Joe Root");
		System.out.println(emailAd);

		List<String> allContactList = getAllContactListInfo("Joe Root");
		System.out.println(allContactList);

//		//a[@_name='Joe Root']   --contact name
		// [@_name='Joe Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		// --select checkbox
		// a[text()='Joe Root']/parent::td/following-sibling::td/a[@context='company']
		// --Company Name
		// a[@_name='Joe
		// Root']/parent::td/following-sibling::td/a/parent::td/following-sibling::td/span
		// --phone number
		// a[@_name='Joe
		// Root']/parent::td/following-sibling::td/a/parent::td/following-sibling::td/span/parent::td/following-sibling::td//a
		// --email

	}

	public static void getSelectCheckbox(String contactName) {
		String xpath = "//a[@_name='" + contactName + "']/parent::td/preceding-sibling::td/input[@type='checkbox']";
		driver.findElement(By.xpath(xpath)).click();
	}

	public static String getContactName(String contactName) {
		String xpath = "//a[@_name='" + contactName + "']";
		String wickerName = driver.findElement(By.xpath(xpath)).getText();
		return wickerName;
	}

	public static String getCompanyName(String contactName) {
		String xpath = "//a[text()='" + contactName + "']/parent::td/following-sibling::td/a[@context='company']";
		String companyName = driver.findElement(By.xpath(xpath)).getText();

		return companyName;
	}

	public static String getPhoneNumber(String contactName) {
		String xpath = "//a[text()='" + contactName
				+ "']/parent::td/following-sibling::td/a/parent::td/following-sibling::td/span";
		String phonenumber = driver.findElement(By.xpath(xpath)).getText();

		return phonenumber;
	}

	public static String getEmailAddress(String contactName) {
		String xpath = "//a[text()='" + contactName
				+ "']/parent::td/following-sibling::td/a/parent::td/following-sibling::td/span/parent::td/following-sibling::td//a";
		String email = driver.findElement(By.xpath(xpath)).getText();

		return email;
	}

	public static List<String> getAllContactListInfo(String contactName) {
		String xpath = "//a[text()='" + contactName + "']/parent::td/preceding-sibling::td/following-sibling::td";
		List<WebElement> allList = driver.findElements(By.xpath(xpath));
		List<String> allContactInfo = new ArrayList<String>();

		for (WebElement e : allList) {
			String listItems = e.getText();

			allContactInfo.add(listItems);

		}
		return allContactInfo;
	}

}
