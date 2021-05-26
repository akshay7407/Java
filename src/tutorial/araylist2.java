package tutorial;

import java.util.ArrayList;
import java.util.Iterator;

public class araylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Object> arr=new ArrayList<Object>();
		// add values in arraylist
		// Object class it an parent class of classses in java...
		
	arr.add(123);
	arr.add("selenium");
	arr.add(true);
	arr.add('A');
	arr.add(23.345);
	arr.add(9665404573l);
	arr.add(null);
	//printing arrayList by using instance of array list
	System.out.println(arr);
	
	// print narray using to string method
	System.out.println(arr.toString());	
	
	// to get index 1 number 
	System.out.println(arr.get(1));
	// check size of the array
	System.out.println(arr.size());
	
	System.out.println(arr.isEmpty());
	
	//print array using for loop
	
	for(int i=0;i<arr.size();i++)
	{
		System.out.println("array list value using for loop====: "+arr.get(i));
		
	}
	
//	//Print array by using iterator concept
	
		Iterator<Object> akg=	arr.iterator();
		
		while(akg.hasNext())
		System.out.println("by suing itertrator concepy==="+akg.next());
		
		
	
	ArrayList <Object>bc=new ArrayList();
	  bc=(ArrayList)arr.clone();
        
	  for(Object akki:bc)
	  System.out.println("print by using enhance for loop=="+akki);
	  
	 
}
}

