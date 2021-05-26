package operatojava;

public class logical {

	public static void main(String[] args) {
		int a=12;
		int b=22;
		int c=23;
		int d=77;
		boolean x = c<d;
		System.out.println(x);
		
		System.out.println((a>b)&&(d>c));
				
		System.out.println((a>b)||(d>c));	
		
		System.out.println((!(a>b))&&(d>c));
		System.out.println(c+d);
		
	}

}
