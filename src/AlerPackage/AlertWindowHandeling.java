package AlerPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindowHandeling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\study-java\\chromedriver.exe ");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");

	}

}
