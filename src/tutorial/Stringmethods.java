package tutorial;

public class Stringmethods {
	
	public static void main(String[] args) {
		// returns the string 
		String abc= "akshay";
		String xyz="yogita";
		int a=abc.length()	;
		
		for (int b=a-1;b>=0;b--)
			System.out.println(abc.charAt(b));
		// reverse the string 
		for(int y=xyz.length()-1;y>=0;y--)
			System.out.println("reverse the string "+xyz.charAt(y));
		
	// concat method 
		
		System.out.println("concat method"+abc.concat(xyz));
		
		// compare to  ethod 
		 System.out.println("compare to method "+abc.compareTo(xyz));
		 
		 //chartct index 
		 
		 System.out.println("charAt method"+abc.charAt(3));
	
	}

}
