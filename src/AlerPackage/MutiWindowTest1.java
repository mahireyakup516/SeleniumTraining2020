package AlerPackage;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutiWindowTest1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\study-java\\chromedriver.exe ");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.findElement(By.id("button1")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[1]/div/p[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[1]/div/p[4]/button")).click();
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		System.out.println("window count= "+ windows.size());
		int i=1;
		for(String window:windows) {
			if(i==3) {
				i++;
				continue;
			}
			
			driver.switchTo().window(window);
			Thread.sleep(2000);
			String title=driver.getTitle();
			System.out.println(i+"-:  "+title);
			i++;
		}
		driver.switchTo().window(windows.get(0));

	}

}
