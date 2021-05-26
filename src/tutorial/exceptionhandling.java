package tutorial;

public class exceptionhandling {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try
		// arthimatic exception 
		{
			int c= a/b;
		}
		catch (Exception e)
		{
			System.out.println("exception occur");
			
		}
		finally
		{
			System.out.println("final statement ");
			
		}
		
		//number format exception 
		
		String u="selenium";
		try {
		int y= Integer.parseInt(u);
		}
		catch (Exception e)
		{
		System.out.println("exception occur due number format exception");
		e.printStackTrace();
		}
	}

}
