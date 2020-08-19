package Loginpage.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClass {
	public String url = "http://logicproems.com/";
	public String username = "1000";
	public String password = "admin@123";
	public static WebDriver driver;

	@Test
	@Parameters("browser")
	public void setup(String browsername) {
		if (browsername.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "D:\\Eclipse\\Loginpage\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Loginpage\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
}
	/*@AfterClass
	public void teardown()
	{
		driver.quit();
	}*/



