package Loginpage.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAnnou {
	
	WebDriver ldriver;
	boolean rbtnStudent = true;
	boolean rbtnStaff=false;
	public CreateAnnou(WebDriver rdriver)
	{
		ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(linkText="Create Announcement")
	WebElement ClickLink;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rbtnSender_0")
	WebElement rbtnStudent1;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rbtnSender_1")
	WebElement rbtnStaff1;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_ddlCourse")
	WebElement ddpCourse;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_ddlBranch")
	WebElement ddpBranch;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_ddlClass")
	WebElement ddpClass;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_GrdSender_ctl02_chkbox")
	WebElement chkstu;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_txtSubject")
	WebElement txtSubject;

	@FindBy(id="ctl00_ContentPlaceHolder1_txtMessage")
	WebElement txtMsg;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_ddlDepartment")
	WebElement ddpDept;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rbtnFacultyType_0")
	WebElement rbtnFact; 
	
	@FindBy(id="ctl00_ContentPlaceHolder1_ddlDesignation")
	WebElement ddpDesig; 
	
	@FindBy(id="ctl00_ContentPlaceHolder1_GrdFacultySender_ctl02_chkbox")
	WebElement chkStaff; 
	
	
	
	@FindBy(id="ctl00_ContentPlaceHolder1_btnSend")
	WebElement btnSend;
	
	
	public void ClickLinkCreate()
	{
		ClickLink.click();
	}
	
	public void rbtnStudent() throws InterruptedException
	{
	if (rbtnStudent=true)
	{
              rbtnStudent1.click();
              Select ddpCourse=new Select(ldriver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlCourse")));
              ddpCourse.selectByVisibleText("Primary");
              Thread.sleep(700);
              Select ddpbranch=new Select(ldriver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlBranch")));
              ddpbranch.selectByVisibleText("1st");
              Thread.sleep(700);
              Select ddpClass=new Select(ldriver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlClass")));
              ddpClass.selectByVisibleText("A");
              Thread.sleep(700);
              chkstu.click();
              txtSubject.sendKeys("Regarding Your Study");
              txtMsg.sendKeys("Rahul you must come with your parent on monday");
              btnSend.click();
              
	}		
	else
	{
		rbtnStaff1.click();
		Select ddpDept=new Select(ldriver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlDepartment")));
		  ddpDept.selectByVisibleText("English");
		  Thread.sleep(7000);
		  rbtnFact.click();
		  Select ddpDesig=new Select(ldriver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlDesignation")));
		  ddpDesig.selectByVisibleText("English teacher");
		  Thread.sleep(7000);
		  chkStaff.click();
	      Thread.sleep(500);
		  txtSubject.sendKeys("Regarding Your Meeting");
        txtMsg.sendKeys("Today you Meeting schedule is 5PM");
        btnSend.click();
	}
	}
}
	

