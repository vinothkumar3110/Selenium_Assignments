package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
		
		
		driver.findElement(By.className("cinemas-inactive")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='INOX The Marina Mall, OMR, Chennai']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[text()='Select Date']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//ul[@class='p-dropdown-items']//span)[2]")).click();	
		driver.findElement(By.xpath("(//span[text()='MADHA GAJA RAJA'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='09:40 PM']")).click();
		driver.findElement(By.xpath("(//span[text()='Book'])[4]")).click();
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.findElement(By.xpath("(//span[text()='5'])[4]")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		WebElement seat = driver.findElement(By.xpath("//div[@class='seat-number']/p"));
		Thread.sleep(1000);
		System.out.println("Seat Number: "+seat.getText());
		Thread.sleep(1000);
		WebElement gtotal = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']//span"));
		System.out.println("Grand Total: "+gtotal.getText());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cross-icon mx-2'])[2]")).click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println("Title: "+title);
		driver.close();
	}

}
