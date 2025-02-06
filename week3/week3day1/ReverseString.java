package Selenium_Assignments.week3.week3day1;

public class ReverseString {

	public static void main(String[] args) {
		String name="vinothkumar";
		System.out.println("My name is :"+name);
		System.out.print("Reverse of my name is : ");
		char[] name1=name.toCharArray();
		for (int i = name1.length-1; i >=0 ; i--) {
			System.out.print(name1[i]);
			
		}

	}

}
