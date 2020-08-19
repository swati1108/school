package Loginpage.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Addfees {
	WebDriver ldriver;
	public  Addfees(WebDriver rdriver)
	{
		ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
	}
	@FindBy(linkText="Add Fees")
	WebElement ClickLink;
	
	public void AddFeess() throws InterruptedException
	{
		ClickLink.click();
		 Select ddpCourse=new Select(ldriver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlCourse")));
         ddpCourse.selectByVisibleText("Secondary");
         Thread.sleep(700);
         Select ddpbranch=new Select(ldriver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlBranch")));
         ddpbranch.selectByVisibleText("5th");
         Thread.sleep(700);
         Select ddpClass=new Select(ldriver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlClass")));
         ddpClass.selectByVisibleText("A");
         Thread.sleep(700);
         Select ddpYear=new Select(ldriver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlAcademicYear")));
         ddpYear.selectByVisibleText("2020-2021");
         Thread.sleep(700);
         Select ddpfees=new Select(ldriver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlCastCategory")));
         ddpfees.selectByVisibleText("Open");
         ldriver.findElement(By.id("ctl00_ContentPlaceHolder1_GrdFees_ctl03_txtFooterPerticular")).sendKeys("Sport Fees");
         ldriver.findElement(By.id("ctl00_ContentPlaceHolder1_GrdFees_ctl03_txtFooterAmount")).sendKeys("500");
         ldriver.findElement(By.id("ctl00_ContentPlaceHolder1_GrdFees_ctl03_imgbtnAdd")).click();
	}
}



