package Selenium_Assignments.week3.week3day2;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("https://www."+endpoint+"/");
		
	}
	public void sendRequest(String endpoint,String body,Boolean status) {
		if (status==true) {
			System.out.println("https://www."+endpoint+"/"+body+"/");
		}
		
	}

	public static void main(String[] args) {
		APIClient ap=new APIClient();
		String endpoint="google.com";
		String body="maps";
		boolean status=true;
		ap.sendRequest(endpoint);
		ap.sendRequest(endpoint,body,status);
		

	}
	

}
