package Selenium_Assignments.week3.week3day1;



public class Pallindrome {

	public static void main(String[] args) {
		int num=3553;
		int origional=num;
		
		int reverse=0;
		while (num!=0) {
			int remind=num%10;
			reverse=reverse*10+remind;
			num=num/10;
			
		}
		
		
		if (origional==reverse) {
			System.out.println(origional+" is palindrome");
			
		} else {
			System.out.println(origional+" is NOT palindrome");

		}
	}
	
}