package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yakefu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// 1.open a browser; webdriver is interface;
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
		String source=driver.getPageSource();
		System.out.println(source);

	}

}
