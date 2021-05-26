package tutorial;

import java.util.ArrayList;

public class ArrrayList {

	public static void main(String[] args) {
ArrayList <Object> a=new ArrayList<Object>();
		
		a.add(10);
		a.add("java");
		a.add(false);
		a.add(null);
		a.add("seleniumm");
		a.add(234);
		a.add('A');
		a.add(23.34);
		System.out.println(a.size());   
		
		System.out.println(a.toString());
		
		a.set(2, "java with selenium");
		
		System.out.println(a.toString());
		a.remove(4);
		System.out.println(a.toString());
	}

}
