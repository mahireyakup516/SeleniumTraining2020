package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateURL {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yakefu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// 1.open a browser; webdriver is interface;
		WebDriver driver= new ChromeDriver();
		String baseURL = "http://www.seleniumhq.org";
		driver.get(baseURL);
		String actualURL= driver.getCurrentUrl();
		if(actualURL.equals(baseURL)) {
			System.out.println("URL maches , test passed");
		}else {
			System.out.println("URL does not mach, test failed");
		}

	}

}
