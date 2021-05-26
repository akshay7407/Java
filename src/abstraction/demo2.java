package abstraction;

public class demo2 extends demo1{

	public void a2(int a) {
		System.out.println(" a2 method started"+a);
		
	}

	
	public void a3() {
		System.out.println("a3 method started");
		
	}
	public static void main(String[] args) {
		demo2 obj=new demo2();
		obj.a1();
		obj.a2(10);
        obj.a3();
	}



}
