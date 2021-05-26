package assignnment;

import java.util.Arrays;

public class assignment3 {
	//print without using loop
	public static void  display() {
		
	int d[]=new int [4];
			d[0]=6;
			d[1]=6;
			d[2]=2;
			d[3]=33;
			String a= Arrays.toString(d);
			Arrays.sort(d);
			System.out.println(a);
	}
			//reverse program
	public static void reverse() {		
			String abc="Akshay";
			int x=abc.length();
			System.out.println(x);
			for(int y=x-1;y>=0;y--)
			{
				System.out.println(abc.charAt(y));
			}
	}
	// create int type array and find out max value in that array
	public static void max() {
	int a[]=new int[6];
	a[0]=44;
	a[1]=55;
	a[2]=4;
	a[3]=13;
	a[4]=15;
	a[5]=556;
	int u= a.length;
 Arrays.sort(a);
 System.out.println("max number="+a[u-1]);
 System.out.println("min number="+a[0]);
	System.out.println(a[0]);

	}
	public static void main(String[] args) {
		display();
		assignment3.reverse();
		max();
		
		
		}

	}


