//Program to check the user input no is Prime or Not

package week1.day2;

import java.util.Scanner;

public class TryIsPrime {
	
	public static boolean prime(int a) {
		if (a<=1) {
			return false;
		}	
		for (int i = 2; i < a; i++) {
			if (a%i==0) {
				return false;
			}			
		}
		return true;
		
	}	
		public 
		static void main(String[] args) {
		System.out.println("Enter the no you want to check if its a Prime: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		sc.close();
		if (prime(a)) {
			System.out.println(a+" is a prime no");
		} else {
			System.out.println(a+" is a Not prime");

		}
		}
	}
			

	
