package Selenium_Assignments.week3.week3day2;

public class Edge extends Browser{
	
	public void takeSnap(String msg) {
		System.out.println(msg);
		}
	public void clearCookies() {
		System.out.println("clearCookies Edge Class");
	}
	

	public static void main(String[] args) {
		Edge ed=new Edge();
		ed.takeSnap("from Egde");
		ed.clearCookies();
		ed.openURL();
		ed.closeBrowser();
		ed.navigateBack();
		

	}

}
