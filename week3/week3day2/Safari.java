package Selenium_Assignments.week3.week3day2;

public class Safari extends Browser{
	public void openIncognito() {
		System.out.println("takeSnap from Safari Class");
	}
	public void fullScreenMode() {
		System.out.println("fullScreenMode from Safari Class");
	}
	

	public static void main(String[] args) {
		Safari sa=new Safari();
		sa.openIncognito();
		sa.fullScreenMode();
		sa.openURL();
		sa.closeBrowser();
		sa.navigateBack();

	}

}
