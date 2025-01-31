package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement count=driver.findElement(By.xpath("//h2[contains(@class,'a-size-base a-spacing-small a-spacing-top-small a-text-normal')]/span"));
		System.out.println(count.getText());
		
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='a-button-inner']/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Newest Arrivals")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//img[@class='s-image']")).click();
		WebElement info = driver.findElement(By.xpath("//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal']"));
		System.out.println("Bag Information: "+info.getText());
		WebElement price = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
		System.out.println("Bag's Price: "+price.getText());
		
		String title=driver.getTitle();
		System.out.println("Titile of the Page :"+title);
		
		driver.quit();		

	}

}
