package Loginpage.testCases;

import org.testng.annotations.Test;
import Loginpage.pageObject.Addfees;

public class TC_Addfees extends TC_Login_001{
	@Test(priority=7)
	public void Addfees ()throws InterruptedException
	{
		Addfees F=new Addfees(driver);
	    F.AddFeess();
	}

}
