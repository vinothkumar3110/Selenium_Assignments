package Selenium_Assignments.week2.week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		System.out.println("Enter Username");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		Thread.sleep(1000);
		System.out.println("Enter Password");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		Thread.sleep(1000);
		System.out.println("Click Login");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		Thread.sleep(3000);
		
		System.out.println("Click CRM/SFA link");
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(1000);
		System.out.println("Click Leads");
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(1000);
		System.out.println("Click Create Leads");
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(1000);
		
		System.out.println("Enter Company Name");
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TCS");
		Thread.sleep(1000);
		
		System.out.println("Enter FirstName");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("vinoth");
		Thread.sleep(1000);
		System.out.println("Enter LastName");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("kumar");
		Thread.sleep(2000);
		System.out.println("Enter FirstName(Local)");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("tcs");
		Thread.sleep(1000);
		System.out.println("Enter Department");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ece");
		System.out.println("Enter Description");
		Thread.sleep(1000);
		driver.findElement(By.id("createLeadForm_description")).sendKeys("ece");
		System.out.println("Enter Email");
		Thread.sleep(1000);
		
		System.out.println("Select State");
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select options=new Select(state);
		Thread.sleep(1000);
		options.selectByVisibleText("New York");
		Thread.sleep(1000);
		
		
		System.out.println("Enter Create Lead Button");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(1000);
		System.out.println("Click Edit");
		driver.findElement(By.xpath("(//div[@class='frameSectionExtra'])[2]/a[3]")).click();
		Thread.sleep(1000);
		System.out.println("Clear Description");
		driver.findElement(By.id("updateLeadForm_description")).clear();
		Thread.sleep(1000);
		System.out.println("Enter impNote");
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Edited");
		System.out.println("Click Update Button");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		System.out.println("Get Title");
		String title=driver.getTitle();
		System.out.println(title);
		
		
		System.out.println("Completed Successfylly");
		//driver.quit();
		
		
		

	}

}
