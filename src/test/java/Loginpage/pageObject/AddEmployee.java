package Loginpage.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddEmployee {


    WebDriver ldriver;

    public AddEmployee(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    public  void Addemp() throws InterruptedException {
       ldriver.findElement(By.linkText("Add Employee")).click();
       ldriver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtFirstName']")).sendKeys("พระพิฆเนศวร");
       ldriver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtMiddleName']")).sendKeys("พระพิฆเนศวร");
       ldriver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtLastName']")).sendKeys("พระพิฆเนศวร");
       ldriver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txt_BirthDate']")).click();
       ldriver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_txt_BirthDate_CalendarExtender_today']")).click();
        Select ddpblood=new Select(ldriver.findElement(By.xpath("//select[@name='ctl00$ContentPlaceHolder1$ddlBloodGroup']")));
        ddpblood.selectByVisibleText("O+ve");
        Select ddpcaste=new Select(ldriver.findElement(By.xpath("//select[@name='ctl00$ContentPlaceHolder1$ddlCasteCategory']")));
        ddpcaste.selectByVisibleText("้ำสสน");
        ldriver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_rbtnGender_0']")).click();
        ldriver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_rbtnMaritalStatus_0']")).click();
        ldriver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtMobileNumber']")).sendKeys("8959565567");
        ldriver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtMobileNumber']")).sendKeys("8959565567");
        ldriver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtEmail']")).sendKeys("พระพิฆเนศวร@gmail.com");
        ldriver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtMotherName']")).sendKeys("พระพิฆเนศวร");
        ldriver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtJoiningDate']")).click();
        ldriver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_JoiningDate_CalendarExtender_today']")).click();
        ldriver.findElement(By.xpath("//textarea[@name='ctl00$ContentPlaceHolder1$txtPresentAddress']")).sendKeys("สิว");
        ldriver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtNationality']")).sendKeys("ไทย");
        ldriver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtPresentPinCode']")).sendKeys("10210 ");
        Select ddpcountry=new Select(ldriver.findElement(By.xpath("//select[@name='ctl00$ContentPlaceHolder1$ddlPresentCountry']")));
        ddpcountry.selectByVisibleText("Thailand");
        Thread.sleep(1000);
        Select ddpState=new Select(ldriver.findElement(By.xpath("//select[@name='ctl00$ContentPlaceHolder1$ddlPresentState']")));
        ddpState.selectByVisibleText("Bangkok");
        Thread.sleep(1000);
        Select ddpdis=new Select(ldriver.findElement(By.xpath("//select[@name='ctl00$ContentPlaceHolder1$ddlPresentCity']")));
        ddpdis.selectByVisibleText("ABC");
        Thread.sleep(1000);
        Select ddprole=new Select(ldriver.findElement(By.xpath("//select[@name='ctl00$ContentPlaceHolder1$DDL_Role']")));
        ddprole.selectByVisibleText("Staff");
        ldriver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_rbtnDesignationType_0']")).click();
        ldriver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtSpecialization']")).sendKeys("พระพิฆเนศวร");
        Select ddpdept=new Select(ldriver.findElement(By.xpath("//select[@name='ctl00$ContentPlaceHolder1$ddlDepartment']")));
        ddpdept.selectByVisibleText("คณิตศาสตร์");
        Thread.sleep(1000);
        Select ddpdeg=new Select(ldriver.findElement(By.xpath("//select[@name='ctl00$ContentPlaceHolder1$ddlDesignation']")));
        ddpdeg.selectByVisibleText("คณิตศาสตร์");
        ldriver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtTeachingExperience']")).sendKeys("1");
        ldriver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtUGDegree']")).sendKeys("พระพิฆเนศวร");
        ldriver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtPGDegree']")).sendKeys("พระพิฆเนศวร");
        ldriver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtOtherQualification']")).sendKeys("พระพิฆเนศวร");
        ldriver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtBankName']")).sendKeys("พระพิฆเนศวร");
        ldriver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtBranchName']")).sendKeys("พระพิฆเนศวร");
        ldriver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtAccountNumber']")).sendKeys("พระพิฆเนศวร");
        ldriver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$PhotoUpload']")).sendKeys("C:\\Users\\SHREE\\Pictures\\boy icon.png");
        ldriver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$btnUploadPhoto']")).click();
        ldriver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtPassword']")).sendKeys("พระพิฆเนศวร");
        ldriver.findElement(By.xpath("//input[@class='ctl00$ContentPlaceHolder1$btnSave']")).click();
















    }
}
