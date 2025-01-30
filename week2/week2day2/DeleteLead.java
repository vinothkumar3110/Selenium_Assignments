package Selenium_Assignments.week2.week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		System.out.println("Login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		Thread.sleep(2000);
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		
		System.out.println("click CRF link");
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(2000);
		
		System.out.println("Enter Leads");
		driver.findElement(By.linkText("Leads")).click();
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println("Enter Find Leads");
		driver.findElement(By.linkText("Find Leads"));
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
//		System.out.println("Enter Phone Tab");
//		driver.findElement(By.xpath("//span[text()='Phone']")).click();
//		Thread.sleep(2000);
		
//		System.out.println("Enter Phone No");
//		driver.findElement(By.xpath("//input[@class=' x-form-text x-form-field ']")).sendKeys("1122");
		
		System.out.println("Enter Find Leads");
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println("Get Leads");
		Thread.sleep(2000);
		String lead=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(lead);
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		Thread.sleep(2000);
		
		System.out.println("Enter Delete Button");
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		Thread.sleep(2000);
		
		System.out.println("Enter Find Leads");
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(2000);
		
//		WebElement leadid = driver.findElement(By.xpath("//div[@class='x-form-element']/input[@class=' x-form-text x-form-field ']"));
//		Thread.sleep(2000);
//		leadid.sendKeys(lead);
		driver.findElement(By.xpath("//div[@class='x-form-element']/input[@class=' x-form-text x-form-field ']")).sendKeys(lead);
		Thread.sleep(2000);
		
		
		System.out.println("Enter Find Leads");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		String norec="No records to display";
		if (norec==driver.findElement(By.xpath("//div[text()='No records to display']")).getText()) {
			System.out.println("Lead ID: "+lead+" Deleted Successfully");
		} else {
			System.out.println("Lead ID: "+lead+" NOT Deleted Properly");
		}
		System.out.println("Completed Successfully");
		
	}

}
