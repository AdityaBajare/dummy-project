package JavaFeatures;

import java.util.ArrayList;
import java.util.List;

public class Foreachmethod {
	
	//internal loops
	public static void main(String[] args) {
		
		List<Integer> al=new ArrayList<Integer>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		
		/* internal loop of collection
		al.forEach(i --> System.out.println(i)); lamda expression
		
		*/
		for(int a:al) {
			System.out.println(a);
		}
		
	}

}
