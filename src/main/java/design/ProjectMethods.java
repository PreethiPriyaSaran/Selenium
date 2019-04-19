package design;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.DataInputProvider;

public class ProjectMethods {

	public static ChromeDriver driver;
	public String dataSheetName;

	@BeforeMethod
	public void startApp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		/*
		 * driver.findElementById("username").sendKeys(username);
		 * driver.findElementById("password").sendKeys(password);
		 * driver.findElementByClassName("decorativeSubmit").click();
		 * driver.findElementByLinkText("CRM/SFA").click();
		 */
	}

	@AfterMethod
	public void closeApp() {
		driver.close();
	}

	@DataProvider(name = "fetchData")
	public String[][] getData() throws IOException {
		return DataInputProvider.getSheet(dataSheetName);
	}

}
