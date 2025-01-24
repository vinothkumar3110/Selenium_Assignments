//Print Odd nos from 0-10

package week1.day2;

public class Oddno {

	public static void main(String[] args) {
		
		int value=10;
		for (int i = 0; i <= value; i++) {
			if (i%2!=0) {
				System.out.println("Odd no is: "+i);
			}
		}
	}
}
