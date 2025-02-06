package Selenium_Assignments.week3.week3day2;

public class Browser {
	String browserName="Chrome";
	int browserVersion=56;
	
	public void openURL(){
		System.out.println("openURL from Browser Class");
	}
	public void closeBrowser(){
		System.out.println("closeBrowser  from Browser Class");
	}
	public void navigateBack() {
		System.out.println("navigateBack  from Browser Class");
	}
	
	public static void main(String[] args) {
		Browser br=new Browser();
		br.openURL();
		br.closeBrowser();
		br.navigateBack();
		System.out.println(br.browserName);
		System.out.println(br.browserVersion);
		
		
		
		
		

	}

}
