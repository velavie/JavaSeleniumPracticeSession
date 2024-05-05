package UtilitySession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElementsClickSendKeys {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");

		// clicking and sendKeys on disabled text fields
//		driver.findElement(By.id("pass")).click(); //No Exception thrown	
//		driver.findElement(By.id("pass")).sendKeys("victor"); //ElementClickInterceptedException

		// sendKeys will 'null' on Enabled text fields
		// driver.findElement(By.id("fname")).sendKeys(null);
		// IllegalArgumentException: keys to send should be null CharSequence(String,
		// StringBuilder or StringBuffer)

//		driver.findElement(By.id("fname")).sendKeys("null");//works as "" means a string

		StringBuilder sb = new StringBuilder("testing");
		String s = "automation";
		driver.findElement(By.id("fname")).sendKeys(sb + s);// will concatenate and result = testingautomation

		// CharSequence ...(three dots means that an Array can also be supplied
		driver.findElement(By.id("fname")).sendKeys(sb, s, "victor"); // will all display in one field
		// CharSequence -- interface
		// String, SBuffer, SBuilder

		// sendKeys - takes CharSequence and not a String
	}

}
