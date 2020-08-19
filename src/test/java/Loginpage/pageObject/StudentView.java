package Loginpage.pageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class StudentView {

	WebDriver ldriver;
	public StudentView(WebDriver rdriver)
	{
		ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(linkText="Student List")
	WebElement ClickLink;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_ddlCourse")
	WebElement ddpCourse;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_ddlBranch")
	WebElement ddpBranch;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_ddlClass")
	WebElement ddpClass;
	
	@FindBy(xpath="//input[@value='Go']")
	WebElement btngo;		
	
	@FindBy(id="ctl00_ContentPlaceHolder1_GrdStudent_ctl04_lnkBtnView")
	WebElement btnview;	
	
	@FindBy(id="ctl00$ContentPlaceHolder1$ddlFeesCategory")
	WebElement ddpFeesCategory; 
	
	@FindBy(xpath="//input[@value='Update']")
	WebElement btnUpdate;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_msgBox_btnOk")
	WebElement btnok;
	
	
	public void Studentlist()
	{
		  ClickLink.click();
	}
	
	
	public void ddp() throws InterruptedException
	{
	        
              Select ddpCourse=new Select(ldriver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlCourse")));
              ddpCourse.selectByVisibleText("Secondary");
              Thread.sleep(700);
              Select ddpbranch=new Select(ldriver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlBranch")));
              ddpbranch.selectByVisibleText("5th");
              Thread.sleep(700);
              Select ddpClass=new Select(ldriver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlClass")));
              ddpClass.selectByVisibleText("A");
              Thread.sleep(700);
              btngo.click();
              btnview.click();
             // Thread.sleep(700);
              Select ddpFeesCategory=new Select(ldriver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlFeesCategory")));
              ddpFeesCategory.selectByVisibleText("OBC");
              btnUpdate.click();
            
       
              
              
}
	public void alert() throws InterruptedException
	{
		Alert alert=ldriver.switchTo().alert();
		String alertMessage= ldriver.switchTo().alert().getText();		
		System.out.println(alertMessage);	
        Thread.sleep(5000);
        alert.accept();		 
        btnok.click(); 
	}
}



