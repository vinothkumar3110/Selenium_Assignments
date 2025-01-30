package Selenium_Assignments.week2.week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookCreateAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abcd");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("xyz");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abcd@xyz.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("asdf");
		Thread.sleep(1000);
		
		WebElement date = driver.findElement(By.name("birthday_day"));
		Select options1=new Select(date);
		options1.selectByValue("31");
		Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select options2=new Select(month);
		options2.selectByValue("10");
		Thread.sleep(1000);
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select options3=new Select(year);
		options3.selectByValue("1990");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		Thread.sleep(1000);
		
		System.out.println("Completed Successfully");

	}

}
