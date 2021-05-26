package overriding;

public class demo2 extends demo1{

	public static void display() {
		System.out.println(" display is off-----");
	}

	public static void main(String[] args) {
		demo1 obj= new demo1();
		obj.display();
		obj.display();
		
	  
		//error- the staic method display ()from the demo2 should be accessed in a static way
	
		
		

	}

}
