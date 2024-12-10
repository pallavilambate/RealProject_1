package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
	WebDriver ldriver;
	public MyAccount(WebDriver rdriver)
	{ 
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(xpath="//input[@id='email_create']")
	WebElement textEmailId;
	
	@FindBy(xpath="//button[@id=\"SubmitCreate\"]")
	WebElement SubmitCreate;
	
	public void EnterEmailID() 
	{
		textEmailId.sendKeys("abcde.com");
	}
	public void clickOnCreate()
	{
		SubmitCreate.click();
	}

}
