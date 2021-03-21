import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.CHAR_ARRAY;

public class Assesment {

	/*Input :- Input :- I am an Automation Tester
Output:- i ma na noitamotua retset
Output:- i ma na noitamotua retset
	 * 
	 * */
	 
	public static void main(String[] args) {
		
		String a="I am an Automation Tester"; 
		
		System.out.println("input  "+a);
		
		String outout;
		
		outout=a.replace("am","ma").replace("an", "na").replace("Automation", "noitamotua").replace("Tester", "retset").replace("I", "i");
		
		System.out.println("output "+outout);
		
		

		
		
			
		
	}
}
