package testNGListeners1;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import lib.BrowserDriverUtility;
import lib.ScreenshotUtility;

//This is the suite level implementation of TestNG Listeners.
//Check tesgng.xml file for that.

public class TestCase1 {

	WebDriver dr;

	@BeforeTest
	public void InvokeBrowser() {
		dr = BrowserDriverUtility.InvokeBrowser("webdriver.chrome.driver",
				"C:\\Chetan\\SeleniumSuite\\WebDrivers\\chromedriver.exe", "https://www.amazon.com");
	}
	
	@Test
	public void AmazonTitleVerify() {
		System.out.println("In testNGListeners1.TestCase1, Title of Webpage is: " + dr.getTitle());
		ScreenshotUtility.CaptureScreenshot(dr, "1_MainPage");
	}
	
	@Test
	public void AmazonTitleMatch() {
		System.out.println("In testNGListeners1.TestCase1, Dummy Title of Webpage.");
		Assert.assertTrue(false);	}
	
	@AfterTest
	public void tearDown() {
		dr.close();
	}
}
