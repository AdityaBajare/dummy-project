package Collectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Mapexample {
	public static void main(String[] args) {
		
		Map<Integer,String> hm=new TreeMap<Integer,String>();
		
		hm.put(5, "pune");
		hm.put(2, "Anil");
		hm.put(3, "Bajare");
		hm.put(4, "Patil");
		hm.put(1, "aditya");
		System.out.println(hm.size());
		
	Set<Entry<Integer, String>> s=hm.entrySet();
	
	for(Entry<Integer, String> m:s) {
		
		System.out.println(m.getKey()+" "+m.getValue());
	}
	}

}
