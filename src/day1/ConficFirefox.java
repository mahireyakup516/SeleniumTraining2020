package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConficFirefox {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Yakefu\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.facebook.com");
	}

}
