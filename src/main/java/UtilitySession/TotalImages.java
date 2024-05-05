package UtilitySession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.alibaba.com");

		// Web Scrapping method
		List<WebElement> allImages = driver.findElements(By.tagName("img"));
		System.out.println("Images number: " + allImages.size());

		for (WebElement e : allImages) {
			String altValues = e.getAttribute("Alt");// get all alt values
			String srcValue = e.getAttribute("src");// get all src values of images

			System.out.println(altValues + "----" + srcValue);

//			if(srcValue.length()!=0) {
//				System.out.println(altValues);
//			}		
		}
		// Utility option at 'FEsUtil' class
	}
}
