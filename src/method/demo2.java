package method;

public class demo2 {
	public static void m1() {
		
		System.out.println("static method without parameter ");
	}
public static void m2(int a,String b) {
	System.out.println("static method with parameter");
	System.out.println(a);
	System.out.println(b);
}
public void display() {
		m1();
	System.out.println("non static method without parameter");
}
public void show(int x ,int y) {
System.out.println("non static with parameter");
	System.out.println(x);			
	System.out.println(y);
}
	public static void main(String[] args) {
		demo2 obj=new demo2();
		m1();
		m2(10, "selenium");
		obj.display();
		obj.show(44, 55);

	}

}
