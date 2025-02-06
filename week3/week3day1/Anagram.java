package Selenium_Assignments.week3.week3day1;

import java.util.Arrays;

public class Anagram {
	public static boolean anagramchk(String word1, String word2) {
		if (word1.length()!=word2.length()) {
			return false;
		}
		char str1[]=word1.toCharArray();
		char str2[]=word2.toCharArray();
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		System.out.println(str1);
		System.out.println(str2);
		return Arrays.equals(str1, str2);
		} 

	public static void main(String[] args) {
		String word1="tea";
		String word2="eat";
		
		if (anagramchk(word1,word2)) {
			System.out.println("Both words are Anagram");
		} else {
			System.out.println("Both words are Not Anagram");
			
		}
		

	}

}
