package Selenium_Assignments.week3.week3day2;

public class TestDataSuperClass {
	public static void enterCredentials(String msg) {
		String tdsc1="SuperClass enterCredentials";
		System.out.println("calling "+tdsc1+" from "+msg);
		
	}
	public static void navigateToHomePage(String msg) {
		String tdsc2="SuperClass navigateToHomePage";
		System.out.println("calling "+tdsc2+" from "+msg);
	}

	public static void main(String[] args) {
		TestDataSuperClass td=new TestDataSuperClass();
		enterCredentials("TestDataSuperClass");
		navigateToHomePage("TestDataSuperClass");

	}

}
