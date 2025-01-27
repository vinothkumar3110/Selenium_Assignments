package Selenium_Assignments.week2.week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("Tuna@321");
		
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.id("login_Layer")).click();
		
		String title=driver.getTitle();
		System.out.println(title);

	}	

	

}
