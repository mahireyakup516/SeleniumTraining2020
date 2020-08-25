package AlerPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeWIndowHandleng {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\study-java\\chromedriver.exe ");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		List<WebElement> iframeElements=driver.findElements(By.tagName("iframe"));
		System.out.println("Total names of iframes"+iframeElements.size());
		driver.switchTo().frame(0);
		String message1=driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		System.out.println(message1);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		//driver.switchTo().frame("frame2");
		driver.switchTo().frame(1);
		//String message2=driver.findElement(By.id("frame2")).getText();
		String message2=driver.findElement(By.xpath("//h1[contains(.,'This is a sample page')]")).getText();
		System.out.println(message2);

	}

}
