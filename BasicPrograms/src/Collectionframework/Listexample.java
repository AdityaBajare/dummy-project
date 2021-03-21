package Collectionframework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Listexample {
	public static void main(String[] args) {
		
	
	
	List<String> al=new ArrayList<String>();
	
	al.add("aditya");
	al.add("bajare");
    al.add("karla");
    al.add("pune");
    al.add("aditya");
    al.add("aditya");
    al.add(" ");
    

    System.out.println("Size is "+al.size());
	System.out.println(al);
	
	System.out.println(al.get(3));
	
	al.set(4, "aaa");
	
	System.out.println(al);
  
}
}