import java.util.Scanner;

public class string_Palindrome {
	 
		   public static void main(String args[])  
		   {  
		    
			 String orig,rev="";
			 
			 Scanner sc=new Scanner(System.in);
			 
			 orig=sc.nextLine();
			 
			 int length=orig.length();
			 
			 for(int i=length-1;i>=0;i--) {
				 
				 rev +=orig.charAt(i);
				 
				 if(orig.equals(rev)) {
					 System.out.println("String is palindrome");
				 }
				 
				 else {
					 System.out.println("Not palindrome");
				 }
			 }
			   
			   
			   
			   
		   }  
		}  