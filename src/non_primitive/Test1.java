package non_primitive;

public class Test1 {

	public static void main(String[] args) {
		// if a number is between 1 and 100 then display number is small
				//if a number is between 101 and 1000 then display number is medium
				// if a number is between 1001 and 10000 then display number is large
				// if the number is above 10001 then diplay number is big no
				//if above is other than display number is zero or negative
		
		int a=1;
		if((a>=1)&&(a<=100))
		{
			System.out.println("the display number is small");
		}
		else if ((a>=101)&&(a<=1000))
		{
			System.out.println("diplay number is medium");
		}
		
		else if ((a>=1001)&&(a<=10000))
		{{
			System.out.println("diplay number is large");
		}}

		else if(a>=10001)
		{
		System.out.println("display number is big");
	}
		else
		{
			System.out.println("number is negative");
		}
	}
}