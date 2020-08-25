package AlerPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class usageOfAlert {
	static WebDriver driver;

	public static void main(String[] args) {
		init();
		popup1();
		popup2();
		

	}
	static void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\study-java\\chromedriver.exe ");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts/");

	}
	static void popup1() {
		driver.findElement(By.id("alertButton")).click();
		Alert myAlert= driver.switchTo().alert();
		myAlert.accept();
	}
	
	static void popup2() {
		driver.findElement(By.id("timerAlertButton")).click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		Alert myAlert=wait.until(ExpectedConditions.alertIsPresent());	
		myAlert.accept();
	}
	
	


}
