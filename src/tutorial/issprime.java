package tutorial;

public class issprime {
	
	public static boolean isprime(int a) {
		
		if (a<=1) {
			return false;			
		}
		
		for (int i=2;i<a;i++)
		{
			if ((a%i)==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("number 8 is prime\n"+isprime(11));
	}
	

}
