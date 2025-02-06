package Selenium_Assignments.week3.week3day2;

public class LoginPage extends BasePage{
	@Override
	public void performCommonTasks(){
		super.performCommonTasks();
		System.out.println("LoginPage");
		
		
	}

	public static void main(String[] args) {
		LoginPage lp=new LoginPage();
		lp.performCommonTasks();

	}

}
