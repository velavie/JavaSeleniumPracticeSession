package UtilitySession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoTable {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/women-s-premier-league-2023-24-1411373/delhi-capitals-women-vs-up-warriorz-women-4th-match-1417719/full-scorecard");

//		String xpath = "//span[text()="Shweta Sehrawat"]/ancestor::td/following-sibling::td//span/span";
//		String wicked = driver.findElement(By.xpath(xpath)).getText();
//		System.out.println(wicked);

		System.out.println(getWicketTaker("Grace Harris"));
		System.out.println(getWicketTaker("Shweta Sehrawat"));

		System.out.println(getScoreCard("Grace Harris"));
		System.out.println(getScoreCard("Shweta Sehrawat"));

	}

	public static String getWicketTaker(String batsManName) {

		String wiTaker = driver
				.findElement(
						By.xpath("//span[text()='" + batsManName + "']/ancestor::td/following-sibling::td//span/span"))
				.getText();

		return wiTaker;
	}

	public static List<String> getScoreCard(String batsManName) {
		String xpath = "//span[text()='" + batsManName
				+ "']//ancestor::td/following-sibling::td[contains(@class, 'ds-text-right')]";

		List<WebElement> ScCard = driver.findElements(By.xpath(xpath));
		List<String> scoreList = new ArrayList<String>();

		for (WebElement e : ScCard) {
			String scores = e.getText();

			scoreList.add(scores);
		}
		return scoreList;
	}

}
