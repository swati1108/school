package Loginpage.testCases;

import org.testng.annotations.Test;

import Loginpage.pageObject.EmployeeView;

public class TC_EmployeeView extends TC_Login_001 {
	@Test(priority=5)
	public void viewEmp() throws InterruptedException
	{
		EmployeeView EV=new EmployeeView(driver);
		EV.employeelink();
		EV.viewEmployee();
		
	}

}
