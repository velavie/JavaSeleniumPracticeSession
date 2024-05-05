package UtilitySession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		Thread.sleep(3000);

//		how many rows on the table - minus header row
		int rCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		System.out.println("Number of Rows: " + (rCount - 1));
		System.out.println("--------------------------");

//		How many columns/headers on the table
		int colCount = driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		System.out.println("Number of columns: " + (colCount));
		System.out.println("--------------------------");

//		1. Getting data from A SINGLE row ONLY - Not considering column name

		// inspecting some row data(along the column to establish pattern - only tr(#)is
		// changing here
		// *[@id="customers"]/tbody/tr[2]/td[1]
		// *[@id="customers"]/tbody/tr[3]/td[1]
		// *[@id="customers"]/tbody/tr[4]/td[1]
		// *[@id="customers"]/tbody/tr[7]/td[1]

		// break up both parts and use tr count to increment for-loop
//		String beforeXpath = "//*[@id=\"customers\"]/tbody/tr[";
//		String afterXpath = "]/td[1]";

		// for loop
//		for(int row = 2; row<=rCount; row++) {
//			String fullXpath = beforeXpath + row + afterXpath;			
//			//System.out.println(fullXpath);			
//			String text = driver.findElement(By.xpath(fullXpath)).getText();			
//			System.out.println(text);
//		}

//		OR	
		// table[@id='customers']//tr/td[1] --[#] data each column
//		List<WebElement> tableList = driver.findElements(By.xpath("//table[@id='customers']//tr/td[1]")); 
//		
//		for(WebElement e: tableList) {
//			String completeList = e.getText();
//			System.out.println(completeList);
//		}

//		OR

//		2. 	Getting ALL DATA from a table
		// th[text()='Company']/parent::tr/following-sibling::tr/td" --lists by ROWS
		// data
		// table[@id='customers']//tr/td[1] ----lists by COLUMNS data
		for (int col = 1; col <= colCount; col++) {
			List<WebElement> tableList = driver.findElements(By.xpath("//table[@id='customers']//tr/td[" + col + "]"));
			for (WebElement e : tableList) {
				String completeList = e.getText();
				System.out.println(completeList);
			}
		}

//		3. Get only the first td/data under each COLUMN
		// th[text()='Company']/parent::tr/following-sibling::tr/td[1] --td[#] get data
		// under each column OR
//		//table[@id='customers']//tr/td[1] --Column [#]		
//		List<WebElement> tableList = driver.findElements(By.xpath("//table[@id='customers']//tr/td[2]"));
//		
//		for(WebElement e: tableList) {
//			String completeList = e.getText();
//			System.out.println(completeList);
//		}

//		getCompleteTableList("Company"); //utility for #2

	}
//	public static List<String> getCompleteTableList(String tableHeader) {
//		
////		From the 'Company' header, go to its parent tr and go to all sibling tr, then get all the data td 
//		List<WebElement> tableList = driver.findElements(By.xpath("//th[text()='"+tableHeader+"']/parent::tr/following-sibling::tr/td"));
//		List<String> allList = new ArrayList<String>();
//		
//		for(WebElement e: tableList) {
//			String completeList = e.getText();
//			System.out.println(completeList);
//			
//			allList.add(completeList);
//		}
//		return allList;
//	}

//	xpath list
	// table[@id='customers']//tr/td[1] --Column [#]
	// th[text()='Company']/parent::tr/following-sibling::tr/td[1]-- Column[#]
	// th[text()='Company']/parent::tr/following-sibling::tr/td --entire table data

}
