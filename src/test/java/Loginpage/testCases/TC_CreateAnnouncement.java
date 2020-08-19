package Loginpage.testCases;

import org.testng.annotations.Test;

import Loginpage.pageObject.CreateAnnou;

public class TC_CreateAnnouncement extends TC_Login_001 {
	@Test(priority=3)
	public void CreateAnnouncement1() throws InterruptedException
	{

		CreateAnnou CA=new CreateAnnou(driver);
		CA.ClickLinkCreate();
		CA.rbtnStudent();
	
	}
}
