package UtilitySession;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HDFCBank {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[contains(@class,'dropdown-toggle')]/span[text()='Loans']")).click();

		Thread.sleep(3000);

		List<WebElement> list = driver.findElements(By.cssSelector("ul.dropdown1.dropdown-menu li"));

		for (WebElement e : list) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals("Cards")) {
				e.click();
				break;
			}
		}

	}

}
