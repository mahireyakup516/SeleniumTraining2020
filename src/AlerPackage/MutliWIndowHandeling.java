package AlerPackage;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutliWIndowHandeling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\study-java\\chromedriver.exe ");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("tabButton")).click();
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("messageWindowButton")).click();
		//Set<String> handles=driver.getWindowHandles();
		ArrayList<String> handles=new ArrayList<String>(driver.getWindowHandles());
		//Object[] windows=handles.toArray();
		for(String handle: handles) {
			System.out.println(handle);
		}
		//System.out.println((String)windows[1]);
		//driver.switchTo().window((String)windows[1]);
		driver.switchTo().window(handles.get(1));
		System.out.println("windows got opened");
	}
	}


