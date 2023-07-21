package demo;

import org.openqa.selenium.chrome.ChromeDriver;
public class VerifyTitle {

	public static void main(String[] args) {
		// open browser
		ChromeDriver driver = new ChromeDriver(); // class object = new class()
		//navigate to application
	     driver.get("https://www.facebook.com/");
		// verify the visitor on the page
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		
		System.out.println(expectedTitle);
		System.out.println(actualTitle);
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("test case passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		// close the browser
		driver.quit();

	}

}
