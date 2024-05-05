package UtilitySession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		// driver.manage().window().maximize(); //--Maximize current window if not
		// already maximized - has page tabs
		// driver.manage().window().fullscreen();//--fullscreen current window - no page
		// tabs

		// 'Responsive' or 'View Port' Testing- Set Window dimension - to see
		// application response with window size
//		Dimension dim = new Dimension(414, 896); --import from selenium
//		driver.manage().window().setSize(dim);

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// sel 4.x
//		driver.manage().window().minimize();
//		driver.manage().window().maximize();

//		WebElement fn = driver.findElement(By.id("input-firstname"));
//		System.out.println(fn.getCssValue("font-size"));
//		
//		int ht = fn.getSize().getHeight();
//		int wd = fn.getSize().getWidth();
//		System.out.println(ht);
//		System.out.println(wd);
//		
//		int x = fn.getLocation().getX();--returns exact location of element X and Y coord
//		int y = fn.getLocation().getY();
//		
//		System.out.println(x + " "  + y);
//		
//		WebElement continue_btn = driver.findElement(By.xpath("//input[@value='Continue']"));
//		String bk_color = continue_btn.getCssValue("background-color");--pick from 'styles' tab in dev tools
//		System.out.println(bk_color);==will return a color code

	}

}
