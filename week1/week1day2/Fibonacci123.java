package week1.day2;



public class Fibonacci123 {

	public static void main(String[] args) {
		int i = 8,a=0,b=1;
		
		for (int j = 0; j <i; ++j) {
			System.out.print(a+" ");
			//swap
			int c=a+b;
			a=b;
			b=c;
		}
		

	}

}
