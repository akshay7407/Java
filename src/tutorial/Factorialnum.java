package tutorial;

public class Factorialnum {
	
	public static int Factorialnum(int num) {
		int fact=1;
		for (int i=1;i<=num;i++) {
			fact=i*fact;
			
		}
		return fact;
	}

	public static void main(String[] args) {
		
		System.out.println(Factorialnum(4));

	}

}
