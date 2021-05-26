package predefined;

public class demo1 {

	public static void main(String[] args) {
		String a= "AKSHAY";
			String b="aKsHaY";
					String c ="gaikwad";
					String d="im learning selenium";
					int y= d.length();
		System.out.println(a.equalsIgnoreCase(b));//true 
		System.out.println(a.equalsIgnoreCase(c));//false
		
		System.out.println(b.toUpperCase());//AKSHAY
        System.out.println(b.toLowerCase());//akshay
        System.out.println(c.substring(5));//ad
        System.out.println(d.endsWith("selenium"));//true
        System.out.println(y);//20
        Integer k=y;
        System.out.println(k.equals(y));//true
        System.out.println(k.equals(20));//true
        System.out.println(k.equals(600));//false 
        float aa= 5565.36f;
        System.out.println(Math.round(aa));//5565
        System.out.println(Math.max(y, aa));//5565.36
       
        

	}

}
