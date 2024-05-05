package UtilitySession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMultiLevelMenuHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("http://www.bigbasket.com");

//		Actions act = new Actions(driver);

		Thread.sleep(4000);

//		driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:R5bab6:']//span[@class='Label-sc-15v1nk5-0 CategoryMenu___StyledLabel2-sc-d3svbp-2 gJxZPQ mbYld'][normalize-space()='Category']")).click(); //1
//		Thread.sleep(2000);	
//		WebElement firstPerf = driver.findElement(By.xpath("(//div//ul/li/a[text()='Cleaning & Household'])[1]"));
//		act.moveToElement(firstPerf).perform();  //2
//		
//		Thread.sleep(2000);	
//		
//		WebElement secHover = driver.findElement(By.xpath("//a[text()='Disposables, Garbage Bag']"));
//		act.moveToElement(secHover).build().perform(); //3
//		Thread.sleep(4000);	
//		
//		driver.findElement(By.xpath("//a[text()='Kitchen Rolls']")).click(); //4

		By parentMenu = By.xpath("(//span[text()='Shop by'])[2]");
		By level1Menu = By.linkText("Cleaning & Household");
		By level2Menu = By.linkText("Disposables, Garbage Bag");
		By level3Menu = By.linkText("Kitchen Rolls");

		handleMenuSubMenuLevel4(parentMenu, level1Menu, level2Menu, level3Menu);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void handleMenuSubMenuLevel4(By parentMenu, By level1Menu, By level2Menu, By level3Menu)
			throws InterruptedException {
		Actions act = new Actions(driver);

		getElement(parentMenu).click();
		Thread.sleep(2000);

		act.moveToElement(getElement(level1Menu)).perform();
		Thread.sleep(2000);

		act.moveToElement(getElement(level2Menu)).perform();
		Thread.sleep(4000);

		getElement(level3Menu).click();
	}

}
