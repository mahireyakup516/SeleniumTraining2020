package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoreMethods {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yakefu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// 1.open a browser; webdriver is interface;
		WebDriver driver= new ChromeDriver();
		/*driver.get("https://www.facebook.com");
		/*String actualPage=driver.getTitle();
		String expectedTitle = "Facebook - Log In or Sign Up";
		if(actualPage.equals(expectedTitle)) {
	System.out.println("title validation passed");
		}else {
			System.out.println("page title validation failed");
		}
		*/
		driver.get("http://hubspot.com/login");
		String pageTitle = driver.getTitle();
		Thread.sleep(5000);
		String pageTitleafterWait = driver.getTitle();
		System.out.println(pageTitle);
		System.out.println(pageTitleafterWait);
		//navigate to a page
		
		//close browser
		
		
		//get page title
		
		//get page URL
		
		//get page source
	}
}
	


