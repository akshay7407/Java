package tutorial;

public class user_defined {
	    //1) static method without return type and zero arguments/parameter
	  //	2) static method without return type and with parameter
		//3)  non static method without return type and zero arguments/parameter
		//4) non static method without return type and with parameter/arguments
		//	5) static method with return type and zero arguments/parameter
		//	6) static method with return type and with parameter
		//	7)  non static method with return type and zero arguments/parameter
		//	8) non static method with return type and with parameter/arguments


 public static void a1() {
	 System.out.println("static method without return type and zero arguments/parameter");
 }
 public static void a2 (int a , int b) {
	 System.out.println("static method without return type and with parameter");
	 System.out.println("value of a:"+a);
	 System.out.println("value of b:"+b);
 }
 public void a3() {
	 System.out.println("non static method without return type and zero arguments/parameter");
	 
 }
 public void a4(String c ,String d) {
	String r= c.concat(d);
	System.out.println(r);
	 System.out.println("non static method without return type and with parameter/arguments");
 }
 public static int a5() {
	 System.out.println(" static method with return type and zero arguments/parameter");
	 int i=5;
	 int u=9;
	 int v=i+u;
	 System.out.println(v);
	 return 55;
 }
	
	 public static String a6 (String k ,String l) {
		String w=k.concat(l);	
		 System.out.println("static method with return type and with parameter ===="+w);
		return "my name";
	 } 
	 public int a7()
	 
	 {
		 System.out.println("non static method without return type and with parameter/arguments");
		 int aa=10;
			int bb=5;
			int cc=aa+bb;
			return cc;
	 }
	 public int a8(int ff ,int gg) {
		 System.out.println("non static method with return type and with parameter/arguments");
		 int k=ff+gg;
		 return k;
	 }
 
	public static void main(String[] args) {
		// static 
a1();
user_defined.a2(55, 55);
int b=user_defined.a5();
System.out.println(b);
String c =user_defined.a6("akshay", "gaikwad");
System.out.println(c);
//------------------------------------------------
// non static
user_defined obj=new user_defined();
obj.a3();
obj.a4("selenium", "test");
obj.a7();
obj.a8(55, 66);



	}

}
