package inheritance;

public class demo3 extends demo2 {
	
	public static void c1() {
		
		System.out.println("c1 method");
		
		
		
	}

	public static void main(String[] args) {
		
		
			demo3 obj= new demo3();
			
			obj.a1();
			obj.a2();
			obj.b1();
			obj.b2();
			obj.c1();
	}

}
