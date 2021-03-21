import java.util.Scanner;

public class InterviewPrograms {
	
	public static void main(String[] args) {
	
		int rem,rev=0,temp,n;
		
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		
		temp=n;
		
		while(n!=0) {
			
			rem=n%10;
			
			rev=(rev*10)+rem;
			n=n/10;
		}
		
		if(temp==rev) {
			System.out.println("String is palindrome");
		}
		
		else {
			
			System.out.println("Not palindrome");
		}
		
		
		
		
		
		
	}
	
	
	
		

}
