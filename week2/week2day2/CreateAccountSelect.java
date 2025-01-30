//***Change the AccountName input field every time to avoid Duplicate Error***//

package Selenium_Assignments.week2.week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountSelect {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		System.out.println("Login Page");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		System.out.println("CRM/SFA link");
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		System.out.println("Accounts page");
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("test117");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		Thread.sleep(1000);
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select options1=new Select(industry);
		options1.selectByVisibleText("Computer Software");
		
		Thread.sleep(1000);
		WebElement owners = driver.findElement(By.name("ownershipEnumId"));
		Select options2= new Select(owners);
		options2.selectByVisibleText("S-Corporation");
		
		Thread.sleep(1000);
		WebElement source = driver.findElement(By.name("dataSourceId"));
		Select options3=new Select(source);
		options3.selectByValue("LEAD_EMPLOYEE");
		
		Thread.sleep(1000);
		WebElement market = driver.findElement(By.name("marketingCampaignId"));;
		Select options4=new Select(market);
		options4.selectByIndex(7);
		
		Thread.sleep(1000);
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select options5=new Select(state);
		options5.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println("Completed Successfully");
		
		//driver.quit();
		
		
		
	}
	

}
