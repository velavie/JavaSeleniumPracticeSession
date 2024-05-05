package MySeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge1 {

	public static void main(String[] args) {

		// 1. Launch Edge driver
		WebDriver driver1 = new EdgeDriver();

		// 2. enter url
		driver1.get("https://www.cnn.com");

		// 3. get the title of site/page
		driver1.getTitle();
		String title1 = driver1.getTitle();

		// print title and verify title
		System.out.println("Page Title is: " + title1);

		// Verify title
		if (title1.contains("News")) {
			System.out.println("Title: " + title1 + " :----- PASS");
		} else {
			System.out.println("Title: " + title1 + " :----- FAIL");
		}

		// 4. get Current url of page - Print URL and Verify URL
		String url = driver1.getCurrentUrl();
		System.out.println("The URL of Current Page is : " + url);

		if (url.contains("cnn.com")) {
			System.out.println("Page url: " + url + " ..... PASS");
		} else {
			System.out.println("Page url: " + url + " ..... FAIL");
		}

		driver1.close();

	}

}
