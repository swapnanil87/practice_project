package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonAuto {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver(); // Open browser
		
		driver.manage().window().maximize(); // maximize
		
		driver.get("https://amazon.in"); // navigate to application
		
		WebElement Mobiles = driver.findElement(By.linkText("Mobiles"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(Mobiles).build().perform();
		
		driver.findElement(By.linkText("Mobiles")).click();
		
		driver.findElement(By.linkText("Apple")).click();
		
		driver.get("https://www.amazon.in/Apple-Original-MMTN2ZM-Lightning-Connector/dp/B01M1EEPOB/ref=sr_1_1?qid=1689066569&refinements=p_89%3AApple&rnid=3837712031&s=electronics&sr=1-1");
		//WebElement AppleEarpods =driver.findElement(By.xpath("//span[contains(@class,'a-size-base-plus a-color-base a-text-normal')]"));
		//AppleEarpods.submit();

		WebElement BuyNow =driver.findElement(By.xpath("//input[contains(@id,'buy-now-button')]"));
		BuyNow.click();
		
		//driver.quit(); // close the browser

	}

}

