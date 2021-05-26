package tutorial;

public class aksha {
int a=100;
	public void aksh(){
		int a=200;
		System.out.println(a);
		System.out.println(this.a);
	}

	public static void main(String[] args) {
	
			aksha obj=new aksha();
			obj.aksh();
			System.out.println(obj.a);
		
		}

	

}
