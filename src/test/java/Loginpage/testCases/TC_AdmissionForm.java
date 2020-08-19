package Loginpage.testCases;

import org.testng.annotations.Test;

import Loginpage.pageObject.Admissionform;

public class 	TC_AdmissionForm extends BaseClass
{
	@Test(priority=6)
	public void AdmissionForm() throws InterruptedException
	{
		Admissionform AF=new Admissionform(driver);
		AF.studentform();
	}
}
