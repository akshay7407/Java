package abstraction;

public class sample2 implements sample1 {
	
	public void akg() {
		System.out.println("akg is the first function ");
										
	}

	public void sql() {
		System.out.println("sql is the second fumction ");		
		
	}

	
	public void csk(int a ,int b) {
	
	
	int c =a*b;
	{
		System.out.println("value of csk="+c);
	}
	}

	
		
		
	
	public static void main(String[] args) {
		
		
 sample2 obj=new sample2();
 obj.akg();
obj.csk(2, 2);
 obj.sql();
 
	}

	

}
