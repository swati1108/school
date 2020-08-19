package Loginpage.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowser {
    WebDriver driver;
   /* @Test
    @Parameters("Name")
    public void parametertest(String Name) {
        System.out.println("Parameterized value is " +Name);
    }
}*/

    @Test
    @Parameters("browser")
    public void verifypagetitle(String browsername) {
        if (browsername.equalsIgnoreCase("firefox"))
        {

            System.setProperty("webdriver.gecko.driver","D:\\Eclipse\\Loginpage\\Driver\\geckodriver.exe");
            driver=new FirefoxDriver();

        } else if (browsername.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\Loginpage\\Driver\\chromedriver.exe");
            driver=new ChromeDriver();
        } else if (browsername.equalsIgnoreCase("IE")) {
            System.getProperty("webdriver.ie.driver", "D:\\Eclipse\\Loginpage\\Driver\\IEDriverserver.exe");
            driver = new InternetExplorerDriver();

        }
        driver.manage().window().maximize();
        driver.get("http://learn-automation.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}

