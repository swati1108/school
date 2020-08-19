package Loginpage.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import java.util.List;

public class StudentLC {
    WebDriver ldriver;

    public StudentLC(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }
    public void  studentlc()
    {
        ldriver.findElement(By.xpath("//a[@href='LeavingCertificate.aspx']")).click();
        ldriver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtStudentId']")).sendKeys("1200001");
        ldriver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$btnGo']")).click();


       //ldriver.findElement(By.id("datepicker")).click();



        }
    }

