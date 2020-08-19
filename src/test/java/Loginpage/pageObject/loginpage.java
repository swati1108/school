package Loginpage.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class loginpage {
WebDriver ldriver;
	
	public loginpage(WebDriver rdriver)
	{
		ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath=("//input[@name='ctl00$ContentPlaceHolder1$txtUserName']"))
	WebElement txtUserName;
	
	@FindBy(xpath=("//input[@name='ctl00$ContentPlaceHolder1$txtPassword']"))
	WebElement txtPassword;
	
	@FindBy(id=("ctl00_ContentPlaceHolder1_BtnLogin"))
	WebElement btnLogin;
	
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void btnLogin() 
	{
		btnLogin.click();
	}
	public void clickSubmit()
	{
		 Select ddpOrg=new Select(ldriver.findElement(By.name("ctl00$ContentPlaceHolder1$DDL_SelectCollege")));
		    ddpOrg.selectByVisibleText("Demo School");
		  ldriver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSubmit")).click();
		
		
	}
}





	