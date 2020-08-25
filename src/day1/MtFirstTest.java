package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MtFirstTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yakefu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// 1.open a browser; webdriver is interface;
		WebDriver driver= new ChromeDriver();
		//2. navigate to URL
		//get will wait to browser completely loaded
		//navigate will not wait until completely loaded
		driver.get("http://www.google.com");
		//driver.navigate().to("http://www.google.com");
		//3. close the browser
		//close to browser by direct close method
		// in multiple browsers, driver.close will only affect the current one
		//session id still exist not nullified
		driver.close();
		//quit() also close browser function: in multiple browsers, quit all;session id will be destroyed or nullified
		// session id will be created browsers it is kind a unique identifier for browser instances; session id=null means did not show any objects 
		driver.quit();
	}

}
