package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class SetUpIE {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Yakefu\\Downloads\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
	WebDriver driver= new InternetExplorerDriver();
	driver.get("https://www.google.com");

}
}
