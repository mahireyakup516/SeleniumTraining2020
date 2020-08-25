package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApplication {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yakefu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// 1.open a browser; webdriver is interface;
		WebDriver driver= new ChromeDriver();
		//driver.get("google.com"); does not work needs http
		//driver.get("www.google.com"); does not work needs http
		driver.get("http://google.com"); // working well since has http

	}

}
