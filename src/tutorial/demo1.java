package tutorial;

public class demo1 {

	public static void main(String[] args) {
	//program 1	
		
        String str1="akshay";
	    String ab= "AKSHAY";
	    System.out.println(str1.compareTo(ab));
	//program 2	
	    String NAME= "akshay ";
	    String middle="kalidas ";
	    String last="gaikwad";
	    System.out.println(NAME.concat(middle)+(last));
	    
	    // program 3
	    
	    String XY= "AKSHAY";
	    String by= "AKSHAY";
	    String ty="akshay";
	    System.out.println(XY.equals(by));
	    
	    //program 4
	    
	    int x []= new int[5];
	    x[0]=3;
	    x[1]=2;
	    x[2]=2;
	    x[3]=4;
	    x[4]=55;
	   
	    for(int a :x)
System.out.println(a);	   
	   
	    
	  for(int b=0;b<x.length;b++)
		  System.out.println(x[b]);
		  
	   
	   
	    
				}

}
