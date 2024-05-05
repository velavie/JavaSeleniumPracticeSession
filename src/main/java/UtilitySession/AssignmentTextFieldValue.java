package UtilitySession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTextFieldValue {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		List<WebElement> textFields = driver.findElements(By.className("form-control"));
		int txtFields = textFields.size();
		System.out.println(txtFields);
		System.out.println("-------------------");

//			for (WebElement e : textFields) {

		String details[] = { "Victor", "Candy", "victor@gmail.com", "21223456", "23Pass213", "23Pass213" };
		for (String s : details) {
			// System.out.println(s);

			for (WebElement e : textFields) {
				if (s.equals(e)) {
					e.sendKeys(s);
					System.out.println(e.getAttribute("value"));
				}
			}
			// break;

		}

//			Assignment
//			List<WebElement> rhLinks =  driver.findElements(By.className("list-group-item"));
//			System.out.println("Links on RHS of page is: " + rhLinks.size()); 
//			
//			for(WebElement e : rhLinks) {  //iterate through all the 
//				
//				//for(int i = 1; i<= rhLinks.size(); i++) {
//					
//					String allRHLinks =  e.getText();
////					System.out.println(i + ": "+ e.getText());
//					//System.out.println(i + ": "+ allRHLinks +i++);
//					//break;
//					System.out.println(allRHLinks);
		// break;
		// }
		// break;

		// }

		// }

		// }

	}

}
