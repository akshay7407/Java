package tutorial;

public class prime {

	public static void main(String[] args) {
   
		int a,b;
		for (a=1;a<=100;a++)
		{
			for (b=2;b<a;b++)
			{
				if (a%b==0)
					break;
				
			}
			if (a==b)
			{
				System.out.println(a);
			}
		
		}
		
	}

}
