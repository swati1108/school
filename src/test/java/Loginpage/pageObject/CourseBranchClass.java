package Loginpage.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseBranchClass {
	WebDriver ldriver;
	public  CourseBranchClass(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(linkText="Course")
	WebElement CourseLink;
	
 @FindBy(xpath="//input[@value='New']")
 WebElement btnNew;

 @FindBy(xpath="//input[@type='text']")
 WebElement txtcourse;
 
 @FindBy(xpath="//input[@value='Save']")
 WebElement btncourseSave;
 
 public void ckeCourse()
 {
	
		 
	 }
 }
