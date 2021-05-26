package abstraction;

public class demo6 extends demo5 {
	
	

	
	public void b6(int a) {
		
		System.out.println("system out print value a==="+a);
		
		
	}

	public  void b7(String b) {
		
		System.out.println("b7 method name is start with this akshay gaikwad name ====="+b);
		
		
		
		
	}


	public static void main(String[] args) {
		demo6 obj= new demo6();
		obj.b1();
		obj.b2();
		obj.b3();
		obj.b5();
		obj.b6(5);
		obj.b7("hmmm");
		
	}
}

	