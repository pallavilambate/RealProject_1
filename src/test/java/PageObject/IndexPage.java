package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
	WebDriver ldriver;
	
	IndexPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy()
	WebElement signIn;
	
	public void clickOnSignIn()
	{
		signIn.click();
	}

}
