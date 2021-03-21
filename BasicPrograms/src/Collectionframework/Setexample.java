package Collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setexample {
	
	public static void main(String[] args) {
		
		
		
		Set<String> al=new TreeSet<String>();
		
		al.add("aditya");
		al.add("bajare");
	    al.add("karla");
	    al.add("pune");
	    al.add("aditya");
	    al.add("aditya");
	    al.add(" ");
	    al.add(" ");
	    

	    System.out.println("Size is "+al.size());
		System.out.println(al);
	  
	}
	

}
