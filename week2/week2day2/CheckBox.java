package Selenium_Assignments.week2.week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		System.out.println("Checking Basic checkbox");
		WebElement basic = driver.findElement(By.xpath("(//div[@id='j_idt87:j_idt89']/div)[2]"));
		basic.click();
		Thread.sleep(1000);
		
		System.out.println("Checking Notification checkbox");
		WebElement notif = driver.findElement(By.xpath("(//div[@id='j_idt87:j_idt91']/div)[2]"));
		notif.click();
		Thread.sleep(1000);
		
		
		System.out.println("Checking Checked display box");
		WebElement checked = driver.findElement(By.xpath("//div[@class='ui-growl-message']/span"));
		checked.isDisplayed();
		Thread.sleep(1000);
		
		System.out.println("Checking Java checkbox");
		WebElement java = driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget']/div)[2]"));
		java.click();
		Thread.sleep(1000);
		
		System.out.println("Checking Tri-State Checkbox display");
		
//		for (int i = 0; i <= 2; i++) {
//
//			driver.findElement(By.xpath("//div[contains(@id,'ajaxTriState')]")).click();
//
//			// driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box
//			// ui')])[8]")).click();
//			Thread.sleep(2000);
//			String triState1 = driver
//					.findElement(By.xpath("//div[@class='ui-growl-message']/p[contains(text(),'State')]")).getText();
//			System.out.println("TriState " + triState1);
//		}
		
		
		WebElement triclk1 = driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']/div)[2]"));
		triclk1.click();
		//Thread.sleep(1000);
		
		System.out.println("Checking State  checkbox");
		WebElement glowmsg=driver.findElement(By.xpath("//div[@class='ui-growl-message']/p[contains(text(),'State')]"));
		Thread.sleep(1000);
		String ss=glowmsg.getText();
		System.out.println(ss);
		
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//		String glowmsg=driver.findElement(By.xpath("//div[@class='ui-growl-message']/p[contains(text(),'State')]")).getText();
//		Thread.sleep(1000);
//		System.out.println(glowmsg);
//		Thread.sleep(1000);
//		triclk1.click();
//		Thread.sleep(3000);
//		String glowmsg1=driver.findElement(By.xpath("//div[@class='ui-growl-message']/p[contains(text(),'State')]")).getText();
//		Thread.sleep(2000);
//		System.out.println(glowmsg1);
		
		Thread.sleep(1000);
		triclk1.click();
		Thread.sleep(1000);
		String glowmsg2=driver.findElement(By.xpath("//div[@class='ui-growl-message']/p[contains(text(),'State')]")).getText();
		Thread.sleep(1000);
		System.out.println(glowmsg2);
		
		Thread.sleep(1000);
		triclk1.click();
		Thread.sleep(1000);
		String glowmsg3=driver.findElement(By.xpath("//div[@class='ui-growl-message']/p[contains(text(),'State')]")).getText();
		Thread.sleep(1000);
		System.out.println(glowmsg3);
		
		Thread.sleep(1000);
		System.out.println("Checking Togle Switch box");
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		  
		System.out.println("Checking Togle switch display box");
		driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed();
		
		boolean enabled = driver.findElement(By.xpath("//div[@class='ui-helper-hidden-accessible']/input[(@id='j_idt87:j_idt102_input')]")).isEnabled();
		System.out.println(enabled);
		
//		
		System.out.println("Click Select box");
		driver.findElement(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu-multiple-container')]")).click();
		Thread.sleep(1000);
		
		System.out.println("Select London");
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[9]")).click();
		Thread.sleep(1000);
		
		System.out.println("Selct Rome");
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[14]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='ui-selectcheckboxmenu-close ui-corner-all']/span")).click();
		
		System.out.println("Executed Successfully");
		//driver.quit();
		
		
	}

}
