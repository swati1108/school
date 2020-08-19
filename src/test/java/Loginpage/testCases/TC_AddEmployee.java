package Loginpage.testCases;

import Loginpage.pageObject.AddEmployee;
import org.testng.annotations.Test;

public class TC_AddEmployee extends TC_Login_001 {

    @Test(priority=10)
    public void AddEmployee() throws InterruptedException {
        AddEmployee AE = new AddEmployee(driver);
        AE.Addemp();

    }
}
