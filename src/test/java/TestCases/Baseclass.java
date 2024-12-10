package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utilities.ReadConfig;

public class Baseclass {
	ReadConfig readconfig=new ReadConfig();
	String baseurl=readconfig.getBrowserUrl();
	String browser=readconfig.getBrowser();
	public static WebDriver driver;

	@BeforeClass
	public void setup() {
			switch(browser.toLowerCase())
			{
			case "chrome":
				driver=new ChromeDriver();
				break;
			case "firefox":
				driver=new FirefoxDriver();
				break;
			case "msedge":
				driver=new EdgeDriver();
				break;
			default:
				driver=null;
				break;
			}
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		}
	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
