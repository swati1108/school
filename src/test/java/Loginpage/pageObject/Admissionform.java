package Loginpage.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Admissionform {
	WebDriver ldriver;
	public  Admissionform(WebDriver rdriver)
	{
		ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
	}
	@FindBy(linkText="Click Here for Admission Form")
	WebElement ClickLink;
	
	
	public void studentform() throws InterruptedException
	{
		ldriver.get("https://logicproems.com/");
		ClickLink.click();
		Select ddpOrg=new Select(ldriver.findElement(By.id("DDL_SelectCollege")));
	    ddpOrg.selectByVisibleText("Demo School");
	    ldriver.findElement(By.id("rbtGender_0")).click();
	    ldriver.findElement(By.id("txtGRNo")).sendKeys("123456");
	    ldriver.findElement(By.id("txtAdmissionDate")).click();
	    ldriver.findElement(By.id("txtAppDate_CalendarExtender_today")).click();
	    ldriver.findElement(By.id("txtAdhar")).sendKeys("195465845456");
	    ldriver.findElement(By.id("txtsaralId")).sendKeys("1200011");
	    Select ddpCourse=new Select(ldriver.findElement(By.id("ddlCourse")));
        ddpCourse.selectByVisibleText("Secondary");
        Thread.sleep(700);
        Select ddpbranch=new Select(ldriver.findElement(By.id("ddlBranch")));
        ddpbranch.selectByVisibleText("5th");
        Thread.sleep(700);
        Select ddpClass=new Select(ldriver.findElement(By.id("ddlClass")));
        ddpClass.selectByVisibleText("A");
        Thread.sleep(700);
        ldriver.findElement(By.id("txtFirstName")).sendKeys("Vishal");
        ldriver.findElement(By.id("txtMiddleName")).sendKeys("Dharam");
        ldriver.findElement(By.id("txtLastName")).sendKeys("Mate");
        Select ddpCountry=new Select(ldriver.findElement(By.id("ddlCountry")));
        ddpCountry.selectByVisibleText("India");
        Thread.sleep(700);
        Select ddpState=new Select(ldriver.findElement(By.id("ddlState")));
        ddpState.selectByVisibleText("Maharashtra");
        Thread.sleep(700);
        Select ddldistric=new Select(ldriver.findElement(By.id("ddlDistrict")));
        ddldistric.selectByVisibleText("Pune");
        ldriver.findElement(By.id("txtBirthDate")).click();
        ldriver.findElement(By.id("txtBirthDate_CalendarExtender_today")).click();
        ldriver.findElement(By.id("txtBirthPlace")).sendKeys("Pune");
        Select ddpblood=new Select(ldriver.findElement(By.id("ddlBloodGroup")));
        ddpblood.selectByVisibleText("A+");
        ldriver.findElement(By.id("txtMotherTongue")).sendKeys("Marathi");
        Select ddpreligion=new Select(ldriver.findElement(By.id("ddlReligion")));
        ddpreligion.selectByVisibleText("Hindu");
        Thread.sleep(700);
        Select ddpNationlity=new Select(ldriver.findElement(By.id("ddlNationality")));
        ddpNationlity.selectByVisibleText("Indian");
        Thread.sleep(700);
        Select ddpfees=new Select(ldriver.findElement(By.id("ddlFeeCategory")));
        ddpfees.selectByVisibleText("OBC");
        Thread.sleep(700);
        ldriver.findElement(By.id("txtLastSchool")).sendKeys("Spgips");
        ldriver.findElement(By.id("txtFatherEmail")).sendKeys("dharam@gmail.com");
        ldriver.findElement(By.id("txtFatherMobile")).sendKeys("9965544478");
        ldriver.findElement(By.id("txtAddress1")).sendKeys("Pimple Gurav,New Sangvi,Pune");
        Select ddpCaste=new Select(ldriver.findElement(By.id("ddlCaste")));
        ddpCaste.selectByVisibleText("OBC");
        Thread.sleep(700);
        ldriver.findElement(By.id("txtFather")).sendKeys("Dharam");
        ldriver.findElement(By.id("txtMother")).sendKeys("Santu");
        ldriver.findElement(By.id("fileupload_StudentPhoto")).sendKeys("E:\\Data Entry\\icon\\New Doc 2019-12-26 11.29.11_3.jpg");
        ldriver.findElement(By.id("btnUploadPhoto")).click();
        Thread.sleep(700);
        ldriver.findElement(By.id("GrdDocumnet_ctl02_checkbox")).click();
        ldriver.findElement(By.id("btnSave")).click();
        
        
	}
	}
	

