package Loginpage.testCases;

import org.testng.annotations.Test;

import Loginpage.pageObject.StudentView;

public class TC_StudentView extends TC_Login_001{
	@Test(priority=4)
	public void StudentView1() throws InterruptedException
	{
		StudentView SV=new StudentView(driver);
		SV.Studentlist();
		SV.ddp();
	    SV.alert();
		
	}
	
}
