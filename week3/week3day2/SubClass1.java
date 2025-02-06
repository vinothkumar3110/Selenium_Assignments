package Selenium_Assignments.week3.week3day2;

public class SubClass1 extends TestDataSuperClass{
	public static void enterUsername(String msg) {
		System.out.println(msg);
	}
	public static void enterPassword(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		SubClass1 sc1=new SubClass1();
		System.out.println("Simple Inheritance");
		sc1.enterCredentials("SubClass1");
		sc1.navigateToHomePage("SubClass1\n");
		
		
		sc1.enterUsername("SubClass1");
		sc1.enterPassword("SubClass1");

	}

}
