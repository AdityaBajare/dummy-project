package JavaFeatures;

public class Sbufer {
	
public static void main(String[] args) {
	
	StringBuffer s= new StringBuffer("Aditya");
	
	StringBuffer s1= new StringBuffer("Aditya");
	System.out.println(s);
s.append(" Patil");
	
System.out.println(s);


if(s.equals("s1")) {
	
	System.out.println("s.equals(\"s1\")");
}

if(s==s1) {
	
	System.out.println("s.equals(\"s1\")");
}

}

}
