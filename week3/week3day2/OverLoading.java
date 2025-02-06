package Selenium_Assignments.week3.week3day2;

public class OverLoading {
	public void reportStep(String msg,String status){
		System.out.println("with 2 input");		
	}
	public void reportStep(String msg,String status,boolean boo){
		System.out.println("with 3 iput");
	}

	public static void main(String[] args) {
		OverLoading ol=new OverLoading();
		ol.reportStep("msg","status");
		ol.reportStep("msg","status",true);

	}

}
