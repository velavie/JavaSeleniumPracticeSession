package UtilitySession;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws MalformedURLException {

		// Navigation - websites - https://naveenautomationlabs.com/opencart/:
		// back and forward
		// get vs to
		// refresh

		WebDriver driver = new ChromeDriver();

		driver.navigate().to(new URL("http://www.google.com"));// OR
		// driver.get("http://www.google.com");
		System.out.println(driver.getTitle());

		driver.get("https://naveenautomationlabs.com/opencart");
		System.out.println(driver.getTitle());

		driver.navigate().to("http://www.google.com");
		// driver.get("http://www.google.com");
		System.out.println(driver.getTitle());

		driver.navigate().back();
		System.out.println(driver.getTitle());

		driver.navigate().forward();
		System.out.println(driver.getTitle());

		driver.navigate().back();
		System.out.println(driver.getTitle());

		// Refresh page
		driver.navigate().refresh();

	}

}
