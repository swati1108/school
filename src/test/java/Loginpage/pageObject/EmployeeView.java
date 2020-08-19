package Loginpage.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EmployeeView {
WebDriver ldriver;
 
public EmployeeView(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
}

@FindBy(linkText="View Employee")
WebElement ClickSearch;


public void employeelink()
{
	ClickSearch.click();
}

public void viewEmployee() throws InterruptedException
{
	Select ddpDept=new Select (ldriver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlDepartment")));
	ddpDept.selectByVisibleText("English");
	Thread.sleep(50);
	Select ddpDegi=new Select(ldriver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlDesignation")));
	ddpDegi.selectByVisibleText("English teacher");
	ldriver.findElement(By.id("ctl00_ContentPlaceHolder1_btnGo")).click();
	ldriver.findElement(By.id("ctl00_ContentPlaceHolder1_grd_ctl02_lnkBtnView")).click();
	
}
}
