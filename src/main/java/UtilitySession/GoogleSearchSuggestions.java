package UtilitySession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSuggestions {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com");

		By searchField = By.name("q");
		By suggestions = By.xpath("//ul[@class='G43f7e' and @role='listbox']//div[@class='wM6W7d']/span");

		// doSearch(By searchlocator, By searchSuggestions, String SearchKey, String
		// value);
		doSearch(searchField, suggestions, "Selenium Automation", "practice");

	}

//		driver.findElement(By.name("q")).sendKeys("Selenium");
//		
//		Thread.sleep(3000);

//		driver.findElements(By.xpath("//ul[@class='G43f7e' and @role='listbox']//div[@class='wM6W7d']/span"));
//		
//		List<WebElement> firstSelection = driver.findElements(By.xpath("//ul[@class='G43f7e' and @role='listbox']//div[@class='wM6W7d']/span"));
//		System.out.println(firstSelection.size());
//		
//		for(WebElement e : firstSelection) {
//			String text = e.getText();
//			System.out.println(text);
//			
//			if(text.contains("python")) {
//				e.click();
//				break;
//			}
//		}
//	}

	// Create a utility
	public static void doSearch(By searchlocator, By searchSuggestions, String SearchKey, String value)
			throws InterruptedException {
		driver.findElement(searchlocator).sendKeys(SearchKey);// selenium

		Thread.sleep(3000);

		List<WebElement> suggList = driver.findElements(searchSuggestions);
		System.out.println(suggList.size());

		for (WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);

			if (text.contains(value)) {
				e.click();
				break;
			}
		}
	}

}
