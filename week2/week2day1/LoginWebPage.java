package Selenium_Assignments.week2.week2day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWebPage {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
//		driver.manage().window().maximize();
//		driver.get("https://ant.aliceblueonline.com/");
		
		
		

	}

}
