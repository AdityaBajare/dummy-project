package Exceptionexample;

public class Strng {
	public static void main(String[] args) {
		
		String s="Aditya";
		
		String s1="Aditya";
		
		String a= new String("Aditya");
		
		if(s==s1) {
			System.out.println("s=s1");
			
		}
		
		if(s.equals(s1)) {
			System.out.println("s.equals(s1)");
			
		}
		
		if(s==a) {
			System.out.println("s==a");
			
		}
		
		if(s.equals(a)) {
			System.out.println("s.equals(a)");
			
		}
		
		
		a.concat("patil");
		
		//System.out.println(a);
	}

}
