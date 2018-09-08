package testNGListeners;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import lib.BrowserDriverUtility;
import lib.ScreenshotUtility;

//This is the class level implementation of TestNG Listeners. So, we will write
//this line: @Listeners(testNGListeners.TestNGListeners.class) before every class.

@Listeners(testNGListeners.TestNGListeners.class)
public class TestCase1 {

	WebDriver dr;

	@BeforeTest
	public void InvokeBrowser() {
		dr = BrowserDriverUtility.InvokeBrowser("webdriver.chrome.driver",
				"C:\\Chetan\\SeleniumSuite\\WebDrivers\\chromedriver.exe", "https://www.amazon.com");
	}

	@Test
	public void AmazonTitleVerify() {
		System.out.println("Title of Amazon Webpage is: " + dr.getTitle());
		ScreenshotUtility.CaptureScreenshot(dr, "TC1_1_MainPage");
	}

	@Test
	public void AmazonTitleMatch() {
		System.out.println("Dummy Title of Amazon Webpage.");
		Assert.assertTrue(false);
	}

	@AfterTest
	public void tearDown() {
		dr.close();
	}
}
