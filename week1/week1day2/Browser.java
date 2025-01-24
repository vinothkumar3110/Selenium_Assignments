//Create Methods and call it from another Class(EdgeBrowser)

package week1.day2;

public class Browser {
	
	public String launchbrowser(String browserName) {
		System.out.println("Browser "+browserName+" launched successfully");
		return browserName;
	}
	
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
		
	}
	public static void main(String[] args) {
		System.out.println("From Main Method");
		Browser ob= new Browser();
		ob.launchbrowser("chrome");
		ob.loadUrl();
		
		

	}

}
