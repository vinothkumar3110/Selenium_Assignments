package Selenium_Assignments.week2.week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		Thread.sleep(1000);
		
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("Tuna@321");
		Thread.sleep(1000);
		
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.id("login_Layer")).click();
		Thread.sleep(1000);
		
		String title=driver.getTitle();
		System.out.println(title);

	}	

	

}
