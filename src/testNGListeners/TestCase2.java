package testNGListeners;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import lib.BrowserDriverUtility;
import lib.ScreenshotUtility;

//This is the class level implementation of TestNG Listeners. So, we will write
//this line: @Listeners(testNGListeners.TestNGListeners.class) before every class.

@Listeners(testNGListeners.TestNGListeners.class)
public class TestCase2 {

	WebDriver dr;

	@BeforeTest
	public void InvokeBrowser() {
		dr = BrowserDriverUtility.InvokeBrowser("webdriver.chrome.driver",
				"C:\\Chetan\\SeleniumSuite\\WebDrivers\\chromedriver.exe", "https://www.google.com");
	}
	
	@Test
	public void GoogleTitleVerify() {
		System.out.println("In testNGListeners.TestCase1, Title of Google Webpage is: " + dr.getTitle());
		ScreenshotUtility.CaptureScreenshot(dr, "TC2_1_MainPage");
	}
	
	@Test
	public void GoogleTitleMatch() {
		System.out.println("In testNGListeners.TestCase1, Dummy Title of Google Webpage.");
		Assert.assertTrue(false);
	}
	
	@AfterTest
	public void tearDown() {
		dr.close();
	}
}
