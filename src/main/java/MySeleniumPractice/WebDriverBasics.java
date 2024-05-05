package MySeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		// open browser: chrome
		// open url
		// get the title
		// verify the title: Actual vs Expected Results

		// 1st Launch the browser - Top Casting
		WebDriver driver = new ChromeDriver();// Launch brwser - child class object refd by parent
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println("Title is : " + title);

		// checkpoint/verification point - Actual vs Expected
		if (title.equals("Amazon.com")) {
			System.out.println("Correct Title : Passed");
		} else {
			System.out.println("Incorrect Title : Failed");
		}

		// Automation steps + Verification points = Automation Testing
		// test steps + verification point -- test case

		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.contains("google.com")) {
			System.out.println("url -- PASSED");
		} else {
			System.out.println("url -- failed");
		}

		// close the browser:quit() and close()
		driver.close();

	}

}
