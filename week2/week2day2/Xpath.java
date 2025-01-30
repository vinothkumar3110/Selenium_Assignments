package Selenium_Assignments.week2.week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		Method-1
//		username
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("dilip@testleaf.com");
//		password
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@2025");
//		loginButton
//		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		//Method-2
		//Username
		//WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("dilip@testleaf.com");
		Thread.sleep(2000);
		
		//Password
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Test@2025");
		Thread.sleep(2000);
		
		//LoginButton
		WebElement login=driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
		
		System.out.println("Completed Successfully");
		
		//driver.close();
	}

}
