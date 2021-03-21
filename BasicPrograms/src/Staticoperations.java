
public class Staticoperations {
	
	static int a=10;
	
	static int b=10;
	
	public  void inc() {
		
		a++;
		b++;
		
		System.out.println("Value of a is" +a);
		
		System.out.println("Value of b is" +b);
	}
	
	
	static {
		System.out.println("This is static block");
	}
	
	

	public static void main(Stringg[] args) {
		
		Staticoperations s= new Staticoperations();
		
		

		Staticoperations s1= new Staticoperations();
		
		Staticoperations s2= new Staticoperations();
		
		s.inc();
		s1.inc();
		s2.inc();
		
		
		
	}
	
}
