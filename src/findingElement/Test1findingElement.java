package findingElement;

import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utility.Utils;

public class Test1findingElement {
	static WebDriver driver;
	static String gender = "female";
	static String hobbies = "reading, music";

	public static void main(String[] args) throws Exception {
		init();
		fillOutForm();
	}

	static void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\study-java\\chromedriver.exe ");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form/");

	}

	static void fillOutForm() throws Exception {
		String fpath = System.getProperty("user.dir");
		UserInfo user1 = Utils.readInfoFromExcel("register.xlsx");

		// driver.findElement(By.id("firstName")).sendKeys("Merhaba");
		driver.findElement(By.id("firstName")).sendKeys(user1.getFirstName());
		driver.findElement(By.id("lastName")).sendKeys(user1.getLastName());
		driver.findElement(By.id("userEmail")).sendKeys(user1.getEmail());
		// WebElement gender=driver.findElement(By.id("gender-radio-2"));
		// JavascriptExecutor executor = (JavascriptExecutor)driver; if we can't really
		// find element location we can use javascripts
		// executor.executeScript("arguments[0]", "gender");
		// System.out.println(driver.findElements(By.name("gender")).size());
		// find elements
		List<WebElement> genderElem = driver.findElements(By.name("gender"));
		// find size of elements
		int elemSize = genderElem.size();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		for (int i = 0; i < elemSize; i++) {
			if (genderElem.get(i).getAttribute("value").equalsIgnoreCase(user1.getGender())) {

				executor.executeScript("arguments[0].click()", genderElem.get(i));
			}

		}

		driver.findElement(By.id("userNumber")).sendKeys(user1.getMobile());

		// birthday input //05/23/1997 dob[0]=05; dob[1]=23; dob[2]=1997
	
		String[] dob = user1.getDateOfBirth().split("[/]");
		System.out.println(user1.getDateOfBirth());
		String monthName = "";
		switch (dob[0]) {
		case "01":
			monthName = "January";
			break;
		case "02":
			monthName = "February";
			break;
		case "03":
			monthName = "March";
			break;
		case "04":
			monthName = "April";
			break;
		case "05":
			monthName = "May";
			break;
		case "06":
			monthName = "June";
			break;
		case "07":
			monthName = "July";
			break;
		case "08":
			monthName = "August";
			break;
		case "09":
			monthName = "September";
			break;
		case "10":
			monthName = "October";
			break;
		case "11":
			monthName = "November";
			break;
		case "12":
			monthName = "December";
			break;
		}
		String dayName = "";
		switch (dob[1]) {
		case "01":
			dayName = "1";
			break;
		case "02":
			dayName = "2";
			break;
		case "03":
			dayName = "3";
			break;
		case "04":
			dayName = "4";
			break;
		case "05":
			dayName = "5";
			break;
		case "06":
			dayName = "6";
			break;
		case "07":
			dayName = "7";
			break;
		case "08":
			dayName = "8";
			break;
		case "09":
			dayName = "9";
			break;
		default:
			dayName=dob[1];
			break;
		}

		WebElement bd = driver.findElement(By.id("dateOfBirthInput"));
		bd.click();
		WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
		Select sel_month = new Select(month);
		sel_month.selectByVisibleText(monthName);
		WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
		Select sel_year = new Select(year);
		sel_year.selectByVisibleText(dob[2]);
		List<WebElement> days = driver.findElements(By.xpath("//div[contains(@class,'react-datepicker__day--\')]"));
		for (int i = 0; i < days.size(); i++) {
			if (!days.get(i).getText().equals(dayName))
				continue;
			else if (days.get(i).getAttribute("class").equalsIgnoreCase("outside-month"))
				continue;
			days.get(i).click();
			break;
		}

		// WebElement bd= driver.findElement(By.id("dateOfBirthInput"));
		// bd.clear();
		// bd.sendKeys("03/12/1980");
		// driver.findElement(By.xpath("div[@id='subjectsContainer']/div/div/div[2]/div/input")).sendKeys("Computer");
		// driver.findElement(By.xpath("//*[@value='1']")).click();
		// driver.findElement(By.xpath("//*[@value='2']")).click();
		// driver.findElement(By.xpath("//*[@value='3']")).click();
		List<WebElement> hobbyList = driver.findElements(By.cssSelector("input[type='checkbox']"));
		// int hobbieSize=hobbyList.size();
		hobbies = user1.getHobbies();
		// if(hobbies.contains("sprots"))
		hobbies = hobbies.replace("Sports", "1");
		hobbies = hobbies.replace("sports", "1");
		// if(hobbies.contains("reading "))
		hobbies = hobbies.replace("Reading", "2");
		hobbies = hobbies.replace("reading", "2");
		// if(hobbies.contains("music"))
		hobbies = hobbies.replace("Music", "3");
		hobbies = hobbies.replace("music", "3");
		// System.out.println(hobbies);
		for (int i = 0; i < hobbyList.size(); i++) {
			if (hobbies.contains(hobbyList.get(i).getAttribute("value")))
				// executor.executeScript("arguments[0].click()", hobbyList.get(i)); //choose
				// all
				executor.executeScript("arguments[0].click()", hobbyList.get(i));
		}

		driver.findElement(By.id("subjectsInput")).sendKeys(user1.getSubjects() + Keys.ENTER);
		driver.findElement(By.id("uploadPicture")).sendKeys(user1.getPicture());

		driver.findElement(By.id("currentAddress")).sendKeys(user1.getCurrentAddress());

		driver.findElement(By.id("react-select-3-input")).sendKeys(user1.getState() + Keys.ENTER);// send the value and
																									// click enter use
																									// Keys.Enter
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("react-select-4-input")).sendKeys(user1.getCity() + Keys.ENTER);
		driver.findElement(By.id("submit")).submit();
		Thread.sleep(2000);
		driver.findElement(By.id("closeLargeModal")).click();
	}

}
