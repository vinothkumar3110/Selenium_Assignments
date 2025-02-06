package Selenium_Assignments.week3.week3day1;

import java.util.Arrays;
import java.util.Iterator;

public class LearnArray {

	public static void main(String[] args) {
		int[] num={2, 5, 7, 7, 5, 9, 2, 3};
		
		System.out.println("By Double FOR loop");
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[i]==num[j]) {
					System.out.println(num[i]+" is Duplicated");					
				}
			}			
		}
		System.out.println("By Single FOR loop");
		Arrays.sort(num);
		for (int i = 0; i < num.length-1; i++) {
			if (num[i]==num[i+1]) {
				//System.out.println(num[i]+" is Dulicate");
				System.out.println("index["+i+"]="+num[i]+" is Dulicate with ["+(i+1)+"]="+num[i+1]);				
			}			
		}
	}
}
