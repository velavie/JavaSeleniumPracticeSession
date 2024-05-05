package UtilitySession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartLoginTest {

	public static void main(String[] args) {

		// to launch browser from create object of BrowserUtil class
		BrowserUtil brUtil = new BrowserUtil();

		WebDriver driver = brUtil.launchBrowser("chrome");

		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		String title = brUtil.getPageTitle();
		System.out.println(title);

		// to enter username and password
		By username = By.id("input-email");
		By pwd = By.id("input-password");

		ElementUtil eleUtil = new ElementUtil(driver);// ElemUtil Class
		eleUtil.doSendKeys(username, "victor@gmail.com");
		eleUtil.doSendKeys(pwd, "victor123");

		// close browser
		// brUtil.closeBrowser();

	}

}
