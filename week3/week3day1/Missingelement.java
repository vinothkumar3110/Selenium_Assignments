package Selenium_Assignments.week3.week3day1;

import java.util.Arrays;

public class Missingelement {

	public static void main(String[] args) {
		int a[]={1, 4,3,2,8, 6, 7};
		Arrays.sort(a);
		for (int i = 1; i < a.length-1; i++) {
			if (i != a[i-1]) {
				System.out.println("The Missing element is: "+i);
				break;
				
			}
			
		}

	}

}
