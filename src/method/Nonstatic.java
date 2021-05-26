package method;

public class Nonstatic {
	public void abc () {
		System.out.println("hello world");
	}
public static void xyz (int a,int b) {
	int h []=new int[2];
	h[0]=a;
	h[1]=b;
	
	for(int y:h) {
		System.out.println(y);
	}
}
	public static void kio(int z,int c) {
	
	{
		System.out.println("total valu");
		System.out.println(z+c);
		System.out.println("main method ended");
		
	}
		
	}
	
	
	public static void main(String[] args) {
		
Nonstatic obj=new Nonstatic();
obj.abc();
obj.xyz(10,20);
obj.kio(5, 5);
}

}
