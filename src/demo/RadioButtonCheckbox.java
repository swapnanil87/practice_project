package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/radio");
		driver.findElement(By.id("yes")).click();
		driver.findElement(By.xpath("(//input[contains(@type,'checkbox')])[2]")).click();
		

	}

}
