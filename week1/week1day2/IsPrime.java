package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		boolean primeno=true;
		
		if (a==0|a==1) {
			primeno=false;
			
		} else {
			for (int i = 2; i < a; i++) {
				int b=a%i;
				if (b==0) {
					primeno=false;
					break;
				}
				
			}
			

		}
		System.out.println(primeno);

	}

}
