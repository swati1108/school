package Loginpage.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Loginpage.pageObject.loginpage;



public class TC_Login_001 extends BaseClass
{
	@Test(priority=1)
	public void LoginTest()
	{
		driver.get(url);
		loginpage lp=new loginpage(driver);
		lp.clickSubmit();
		Select ddprole=new Select(driver.findElement(By.name("ctl00$ContentPlaceHolder1$DDL_SelectAuthority")));
		ddprole.selectByVisibleText("Admin");
		lp.setUserName(username);
		lp.setPassword(password);
		lp.btnLogin();
		
		if (driver.getTitle().equals("Education Management System"))
		{
			Assert.assertTrue(true);
			
			
		}
		else
		{
			Assert.assertTrue(false);
			
		}
	}

	}



