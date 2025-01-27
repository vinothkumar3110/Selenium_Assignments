package Selenium_Assignments.week2.week2day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Step-1-To open the chrome browser initialize the that driver
		ChromeDriver cdriver=new ChromeDriver();
		
		//Step-2-Maximize the browser window
		cdriver.manage().window().maximize();
		
		//Step-3-Load the URL
		cdriver.get("https://www.facebook.com/");
		
//		//Step-4-Java-wait-Thread.sleep();
		Thread.sleep(5000);
		
		//Step-4-Close the window
		cdriver.close();

	}

}
