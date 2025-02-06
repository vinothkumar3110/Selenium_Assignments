package Selenium_Assignments.week3.week3day2;

public class OverRiding extends Edge{
	public void reportStep(String msg) {
	super.takeSnap(msg);
	System.out.println(msg);
	}

	public static void main(String[] args) {
		OverRiding or=new OverRiding();
		or.takeSnap("from OverRiding");
		or.reportStep("from OverRiding");

	}

}
