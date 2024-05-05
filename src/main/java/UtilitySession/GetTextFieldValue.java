package UtilitySession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldValue {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// 'value' attribute(invisible) holds the text entered in text field
		driver.findElement(By.id("input-firstname")).sendKeys("Victor");
		String fname = driver.findElement(By.id("input-firstname")).getAttribute("value");

		driver.findElement(By.id("input-lastname")).sendKeys("Smiles");
		String lname = driver.findElement(By.id("input-lastname")).getAttribute("value");

		driver.findElement(By.name("email")).sendKeys("Victor123@opencart.com");
		String emailid = driver.findElement(By.name("email")).getAttribute("value");

		driver.findElement(By.id("input-telephone")).sendKeys("1932556542");
		String phone = driver.findElement(By.id("input-telephone")).getAttribute("value");

		driver.findElement(By.id("input-password")).sendKeys("Password@123");
		String password = driver.findElement(By.id("input-password")).getAttribute("value");

		driver.findElement(By.id("input-confirm")).sendKeys("Password@123");
		String passVerify = driver.findElement(By.id("input-confirm")).getAttribute("value");

		System.out.println(fname);
		System.out.println(lname);
		System.out.println(emailid);
		System.out.println(phone);
		System.out.println(password);
		System.out.println(passVerify);

	}
}