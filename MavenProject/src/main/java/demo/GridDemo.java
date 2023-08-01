package demo;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GridDemo {
	ChromeDriver driver;
	
	@BeforeTest
	public void launchApplication() {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver new URL ("http://localhost:4444/wd/hub"), cap);
		driver.get("https://facebok.com");
	}
	
	@Test
	Run | Debug
	public void titleVerification() {
		String expectedTitle = "Facebook - log in or sign up";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
}
