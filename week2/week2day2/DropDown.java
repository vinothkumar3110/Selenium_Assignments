package Selenium_Assignments.week2.week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.telerik.com/contact");
		
		WebElement dd1=driver.findElement(By.id("Dropdown-1"));
		Select options1=new Select(dd1);
		options1.selectByVisibleText("General Inquiries");//Select By Visible Text
		Thread.sleep(2000);
		
		WebElement dd2=driver.findElement(By.id("Dropdown-2"));
		Select options2=new Select(dd2);
		options2.selectByIndex(10); //Select By Index
		Thread.sleep(2000);
		
		WebElement dd3=driver.findElement(By.id("Country-1"));
		Select options3=new Select(dd3);
		options3.selectByValue("Canada");// Select By Value
		Thread.sleep(2000);
		
		System.out.println("Completed Successfully");
		//driver.close();
		
		

	}

}
