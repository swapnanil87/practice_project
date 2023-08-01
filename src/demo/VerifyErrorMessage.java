package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver(); // open browser
		
		driver.get("https://www.facebook.com/"); //navigate to application
		
		driver.findElement(By.id("email")).sendKeys("batman554466@gmail.com"); //enter invalid email
		
		driver.findElement(By.id("pass")).sendKeys("pass0987@"); // enter invalid password
		
		driver.findElement(By.name("login")).click();	// verify the error message	
		
		String expectedErrMsg = "The email address you entered isn't connected to an account. Find your account and log in.";
		//String actualErrMsg = driver.findElement(By.cssSelector("#email_container > div._9ay7")).getText();
		String actualErrMsg = driver.findElement(By.xpath("(//div[contains(@class,'ay')])[3]")).getText();
		System.out.println(expectedErrMsg);
		System.out.println(actualErrMsg);
		
		if(expectedErrMsg.equals(actualErrMsg)) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		
		driver.quit(); // close the browser

	}

}
