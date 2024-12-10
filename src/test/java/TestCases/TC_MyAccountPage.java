package TestCases;

import org.testng.annotations.Test;

import PageObject.IndexPage;
import PageObject.MyAccount;

public class TC_MyAccountPage extends Baseclass {
	@Test
	public void verifyRegistrationandLogin() {
		//open url
		driver.get(baseurl);
		
		IndexPage pg=new IndexPage(driver);
		pg.clickOnSignIn();
		MyAccount ma=new MyAccount(driver);
		ma.EnterEmailID();
		ma.clickOnCreate();
	}
	@Test
	public void EnterEmailId() {
		
	}

}
