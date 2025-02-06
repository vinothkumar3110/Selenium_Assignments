package Selenium_Assignments.week3.week3day2;

public class Chrome extends Browser{
	
	public void openIncognito(){
		System.out.println("openIncognito from Chrome Class");
	}
	public void clearCache() {
		System.out.println("clearCache from Chrome Class");
	}
	

	public static void main(String[] args) {
		Chrome ch=new Chrome();
		ch.openIncognito();
		ch.clearCache();
		ch.openURL();
		ch.closeBrowser();
		ch.navigateBack();
		
		 
		
	}

}
