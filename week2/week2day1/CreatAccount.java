//Change the AccountName everytime while run the code to Avoid Duplicate Entry Error

package Selenium_Assignments.week2.week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement username =driver.findElement(By.id("username"));
		Thread.sleep(1000);
		username.sendKeys("Demosalesmanager");
		Thread.sleep(1000);
		
		WebElement password =driver.findElement(By.id("password"));
		Thread.sleep(1000);
		password.sendKeys("crmsfa");
		Thread.sleep(1000);
		
		WebElement loginBtn =driver.findElement(By.className("decorativeSubmit"));
		loginBtn.click();
		Thread.sleep(1000);
		WebElement crmsfa =driver.findElement(By.linkText("CRM/SFA"));
		Thread.sleep(1000);
		crmsfa.click();
		Thread.sleep(1000);

		WebElement accounts =driver.findElement(By.linkText("Accounts"));
		accounts.click();
		Thread.sleep(1000);
		
		WebElement createac =driver.findElement(By.linkText("Create Account"));
		createac.click();
		Thread.sleep(1000);
		
		WebElement accountname =driver.findElement(By.id("accountName"));
		accountname.sendKeys("Vinothkumar3");
		Thread.sleep(1000);
		
		WebElement desc =driver.findElement(By.name("description"));
		desc.sendKeys("Selenium Automation Tester");
		Thread.sleep(1000);
		
		WebElement noofEmp =driver.findElement(By.id("numberEmployees"));
		noofEmp.sendKeys("30");
		Thread.sleep(1000);
		
		WebElement sname =driver.findElement(By.id("officeSiteName"));
		sname.sendKeys("LeafTaps");
		Thread.sleep(1000);
		
		WebElement createBtn =driver.findElement(By.className("smallSubmit"));
		createBtn.click();
		Thread.sleep(1000);
		
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(1000);
		
		System.out.println("Completed Successfully");
		Thread.sleep(1000);
		//driver.close();
		
		
	}

}
