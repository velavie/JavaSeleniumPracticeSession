package MySeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceMultiWindowHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// parent
		Thread.sleep(3000);

		// Got To Parent wID = separately
		String parentWinId = driver.getWindowHandle();

		driver.findElement(By.xpath("//a[contains(@href, 'linkedin')]")).click();// child1
		driver.findElement(By.xpath("//a[contains(@href, 'facebook')]")).click();// child2
		driver.findElement(By.xpath("//a[contains(@href, 'twitter')]")).click();// child3
		driver.findElement(By.xpath("//a[contains(@href, 'youtube')]")).click();// child4
		Thread.sleep(3000);

		// 1. FETCH window ids
		Set<String> handles = driver.getWindowHandles();// to get window ids for all child

		Iterator<String> itir = handles.iterator(); // to iterate/access parent and child windows
		// String childWinId = itir.next();

		while (itir.hasNext()) {
			String WinId = itir.next();
			driver.switchTo().window(WinId);
			System.out.println("Child Window ID: " + WinId + "Current URL = :" + driver.getTitle());

			if (!WinId.equals(parentWinId)) {
				driver.close();
			}
			Thread.sleep(1000);
		}

//				String chiildWinId_2 = itir.next();
//				driver.switchTo().window(chiildWinId_2);
//				System.out.println("Child 2 Window ID: " + chiildWinId_2  + "Current URL = :" + driver.getTitle());
//				driver.close();
//				
//				String chiildWinId_3 = itir.next();//iterator move the next object = move to parent
//				driver.switchTo().window(chiildWinId_3);
//				System.out.println("Child 3 Window ID: " + chiildWinId_3 + "Current URL = :" + driver.getTitle());	
//				driver.close();
//				
//				String chiildWinId_4 = itir.next(); //iterator move the next object = move to 1st child
//				driver.switchTo().window(chiildWinId_4);
//				System.out.println("Child 4 Window ID: " + chiildWinId_4  + "Current URL = :" + driver.getTitle());
//				driver.close();

		// switching parent window
		driver.switchTo().window(parentWinId);
		System.out.println("Final: " + driver.getTitle());

	}

}
