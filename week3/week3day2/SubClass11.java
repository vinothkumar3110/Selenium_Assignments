package Selenium_Assignments.week3.week3day2;

public class SubClass11 extends SubClass1{

	public static void main(String[] args) {
		SubClass11 sc11=new SubClass11();
		System.out.println("Multi Level Inheritance");
		sc11.enterCredentials("SubClass11");
		sc11.navigateToHomePage("SubClass1\n");
		sc11.enterUsername("SubClass11");
	}

}
