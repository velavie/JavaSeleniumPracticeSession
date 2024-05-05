package UtilitySession;

public class AmazonTest {

	public static void main(String[] args) {
		// To launch browser - by not repeating 'Weddriver driver = new ChromeDriver' -
		// each time
		// Create the object of all drivers from here instead - from BrowserUtil class

		String browserName = "chrome";

		BrowserUtil brUtil = new BrowserUtil();// create object of BrowserUtil class

		// 1. Call 'launchBrowser' function/method from BrowserUtil class
		brUtil.launchBrowser(browserName);

		// 2. Call 'launchURL' function/method from BrowserUtil class
		brUtil.launchURL("https://www.amazon.com");

		// 3. Call 'getPageTitle' function/method from BrowserUtil class + validations
		String title = brUtil.getPageTitle();
		if (title.contains("Amazon")) {
			System.out.println(title + ": correct title -- PASS");
		} else {
			System.out.println("incorrect title -- FAIL");
		}

		// 4. Call 'getPageUrl' function/method from BrowserUtil class
		String url = brUtil.getPageUrl();
		if (url.contains("amazon.com")) {
			System.out.println(url + " :URL is----- PASS");
		} else {
			System.out.println(url + " :URL is----- FAIL");
		}

		// 5. Call 'closeBrowser' function/method from BrowserUtil class
		brUtil.closeBrowser();

	}

}
