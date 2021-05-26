package encapsulation;

public class demo1 {
	
	// private string 
       private String a="akshay";
       
       //non static method with return type 
       
       public String getName() {
    	   
    	   return a;
       }
       
       // non static method without retun type
       public void setName (String b) {
    	  this.a=b;
       }
       
	public static void main(String[] args) {
		demo1 obj=new demo1();
		obj.getName();
		obj.setName("Akshay gaikwad ");
	
		System.out.println(obj.getName());
	
			
		
	}

}
