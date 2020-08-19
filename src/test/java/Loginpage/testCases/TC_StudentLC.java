package Loginpage.testCases;

import org.testng.annotations.Test;
import Loginpage.pageObject.StudentLC;

public class TC_StudentLC extends TC_Login_001{
    @Test(priority=8)
    public  void StudentLC()
    {
        StudentLC SLC=new StudentLC(driver);
        SLC.studentlc();


    }
}
