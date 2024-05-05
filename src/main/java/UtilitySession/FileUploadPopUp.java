package UtilitySession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

		// *****Attribute 'type = file'is mandatory --Ask developer to add if not
		// present********

//		c:\\document\\test.txt
		driver.findElement(By.name("upfile"))
				.sendKeys("C:\\Users\\veela\\OneDrive\\Documents\\NC Restatement fees.txt");

		// sikuli - image based/resolution based
		// autoIT -- only for windows machine -- wont work in docker, headless, jenkins,
		// linux, macos

//		"C:\Users\veela\OneDrive\Documents\NC Restatement fees.txt"

	}

}
