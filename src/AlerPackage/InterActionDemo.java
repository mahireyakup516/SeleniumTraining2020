package AlerPackage;

import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InterActionDemo {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\study-java\\chromedriver.exe ");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.get("https://jqueryui.com/draggable/");
		//dragable();
		Thread.sleep(2000);
		//droppable();
		selectable();
////		
//		Thread.sleep(1000);
//		//WebElement iframe=driver.findElement(By.tagName("iframe"));
//		driver.switchTo().frame(0);
//		WebElement b1=driver.findElement(By.id("draggable"));
//		Actions actions=new Actions(driver);
//		actions.dragAndDropBy(b1, 50, 30).build().perform();
	}

	/*
	public static void dragable() throws Exception {
		driver.get("https://jqueryui.com/draggable/");
		Thread.sleep(1000);
		//WebElement iframe=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(0);
		WebElement b1=driver.findElement(By.id("draggable"));
		Actions actions=new Actions(driver);
		actions.dragAndDropBy(b1, 50, 30).build().perform();
	}
	
	public static void droppable() throws InterruptedException {
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement b2=driver.findElement(By.id("droppable"));
		WebElement b3=driver.findElement(By.id("draggable"));
		Actions action=new Actions(driver);
		action.dragAndDrop(b3, b2).build().perform();
		
	}
	*/
	public static void selectable() {
		driver.get("https://jqueryui.com/selectable/");
		driver.switchTo().frame(0);
		List<WebElement> sel_element=driver.findElements(By.xpath("//*[@id='selectable']/li"));
		// select 1,3,6,7;
		Actions actions = new Actions(driver);
		actions=actions.keyDown(Keys.CONTROL);
		for(int i=0; i<7; i++) {
			if(i==1 || i==3 || i==4) 
				continue;
			//sel_element.get(i).click(); only click item does not have relation with control actions
		actions.click(sel_element.get(i));
	}
		//actions. keyDwon(keys.CONTROL).click(sel_elelmt.get(0).click.....get(6)
		actions.keyUp(Keys.CONTROL).build().perform();
	}
}
