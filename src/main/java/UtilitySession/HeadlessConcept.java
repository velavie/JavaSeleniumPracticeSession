package UtilitySession;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessConcept {

	public static void main(String[] args) {

		// headless vs headed
		// headless: No browser visibility(browser running in background)
		// ADV:
		// faster
		// runs on CICD/Jenkins/Linux - does not require a UI
		// Not recommended
		// runs on local only
		// DisAdv:
		// Not an actual user simulation
		// complex apps/HTML DOM: does not work
		// Alerts/popups: may not work properly

		// ChromeOptions object
//		ChromeOptions co = new ChromeOptions();
//		//co.addArguments("--headless");
//		//to launch incognito window
//		co.addArguments("incognito");
///		WebDriver driver = new ChromeDriver(co);//co must be supplied to ChromeDriver

		// Firefox Options
		FirefoxOptions fo = new FirefoxOptions();
		// fo.addArguments("--headless");
		fo.addArguments("--private");

		// Edge Options
		// EdgeOptions eo = new EdgeOptions();
		// eo.addArguments("--headless");
		// eo.addArguments("--inprivate");

		WebDriver driver = new FirefoxDriver(fo);

		driver.get("https://naveenautomationlabs.com/opencart");
		System.out.println(driver.getTitle());

		driver.quit();

	}

}
