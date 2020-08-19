package Loginpage.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdmissionStatus {
	WebDriver ldriver;
	public AdmissionStatus(WebDriver rdriver)
	{
		ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
	}

	
	@FindBy(linkText="Admission Status")
	WebElement ClickLink;
	
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rblStatus_0")
	WebElement radiobtnPending;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rblStatus_1")
	WebElement radiobtnComplete;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rblStatus_2")
	WebElement radiobtnCancle;

	
	@FindBy(id="ctl00_ContentPlaceHolder1_btnGo")
	WebElement btnGo;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_btnPrint")
	WebElement btnPrint;
	
	
	public void ClinkLink()
	{
		ClickLink.click();
	}

	public void ClickPending()
	{
		radiobtnPending.click();
	}
	public void ClickComplete()
	{
		radiobtnComplete.click();
	}
	
	public void Clickcancle()
	{
		radiobtnCancle.click();
	}
	public void ThreadSleep() throws InterruptedException
	{
		Thread.sleep(5000);
	}
	public void ClickGo()
	{
		btnGo.click();
	}
	public void ClickPrint()
	{
		btnPrint.click();
	}


}
