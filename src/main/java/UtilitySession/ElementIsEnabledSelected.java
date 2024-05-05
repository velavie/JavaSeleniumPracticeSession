package UtilitySession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsEnabledSelected {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");

		// Inspect the submit button and observe that disabled="disabled"
		// notice...if checkbox is checked, disable property disappears and button is
		// enabled
		// driver.findElement(By.name("agreeTerms")).click();

		// is Displayed - element id present on the page
		// isEnabled - element is present on page, but enabled or not
		// isSelected - is checkbox checked

		boolean flag = driver.findElement(By.id("submitButton")).isDisplayed(); // true
		System.out.println(flag);// false
		boolean chck_flag = driver.findElement(By.name("agreeTerms")).isDisplayed(); // true
		System.out.println(chck_flag);// false

		flag = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(flag);// false

		chck_flag = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(chck_flag);// false

		driver.findElement(By.name("agreeTerms")).click();

		chck_flag = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(chck_flag);// true

		flag = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(flag);// true

	}

}
