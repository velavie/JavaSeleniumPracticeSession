package UtilitySession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectionWithSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");

		WebElement multiList = driver.findElement(By.xpath("//select[@multiple]"));

		Select select = new Select(multiList);

		// check if it 'multiple method' //true: for 'select class' only
		System.out.println(select.isMultiple());

		if (select.isMultiple()) {

			System.out.println("This is a Milti Selection :");
			System.out.println(multiList.getText());

			select.selectByVisibleText("Andean flamingo");
			select.selectByVisibleText("Chilean flamingo");
			select.selectByVisibleText("Lesser flamingo");
			select.selectByVisibleText("James's flamingo");
		}

		select.deselectByVisibleText("James's flamingo");
		select.deselectAll();
	}

}
