package Loginpage.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Loginpage.pageObject.AdmissionStatus;

public class TC_AdmissionStatus extends TC_Login_001 {
	@Test(priority=2)
	public void AdmissionStatus1() throws InterruptedException
	{
		//loginpage lp=new loginpage(driver);
		
	    
	    AdmissionStatus Ad=new AdmissionStatus(driver);
	    Ad.ClinkLink();
	    Ad.ClickPending();
	    Ad.ClickGo();
	    Ad.ThreadSleep();
	    Ad.ClickPrint();
	    Ad.ClickComplete();
	    Ad.ClickGo();
	    Ad.ClickPrint();
	    Ad.ThreadSleep();
	    Ad.Clickcancle();
	    Ad.ClickGo();
	    Ad.ClickPrint();
	    
	}
	

}
