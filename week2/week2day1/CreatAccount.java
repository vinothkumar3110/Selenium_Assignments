package Selenium_Assignments.week2.week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatAccount {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement username =driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		
		WebElement password =driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		
		WebElement loginBtn =driver.findElement(By.className("decorativeSubmit"));
		loginBtn.click();
		
		WebElement crmsfa =driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();

		WebElement accounts =driver.findElement(By.linkText("Accounts"));
		accounts.click();
		
		WebElement createac =driver.findElement(By.linkText("Create Account"));
		createac.click();
		
		WebElement accountname =driver.findElement(By.id("accountName"));
		accountname.sendKeys("Vinothkumar2");
		
		WebElement desc =driver.findElement(By.name("description"));
		desc.sendKeys("Selenium Automation Tester");
		
		WebElement noofEmp =driver.findElement(By.id("numberEmployees"));
		noofEmp.sendKeys("30");
		
		WebElement sname =driver.findElement(By.id("officeSiteName"));
		sname.sendKeys("LeafTaps");
		
		WebElement createBtn =driver.findElement(By.className("smallSubmit"));
		createBtn.click();
				
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
	}

}
