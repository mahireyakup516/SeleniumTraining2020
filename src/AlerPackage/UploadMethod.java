package AlerPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadMethod {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\study-java\\chromedriver.exe ");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");
		oldWayMethod();
		robotMethod();
		

	}
	
	static void oldWayMethod() {
		driver.findElement(By.id("uploadFile")).sendKeys("C:\\study-java\\Selenium Training 2020\\picture1.jpg");
		
	}
	
	static void robotMethod() {
		try {
			
			WebElement element=driver.findElement(By.id("uploadFile"));
			element.sendKeys(Keys.ENTER);
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_C);
			robot.keyPress(KeyEvent.VK_COLON);
			robot.keyPress(KeyEvent.VK_BACK_SLASH);
			robot.keyPress(KeyEvent.VK_1);
			robot.keyPress(KeyEvent.VK_2);
			robot.keyPress(KeyEvent.VK_3);
			robot.keyPress(KeyEvent.VK_T);
			robot.keyPress(KeyEvent.VK_X);
			robot.keyPress(KeyEvent.VK_T);
			robot.keyPress(KeyEvent.VK_ENTER);
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
