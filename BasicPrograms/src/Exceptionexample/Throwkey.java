package Exceptionexample;

public class Throwkey {
	
	static void validate(int age) {
		
		if(age<18) {
		
		throw new ArithmeticException("Not Valid");
		}
		
		else {
			System.out.println("welcome to vote");
		}
			
			
	}
	
public static void main(String[] args) {
	validate(20);
	System.out.println("Rest of the code");
}
	
}
