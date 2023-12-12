package hashmap.demos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap5 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
		hm1.put("Gaurav", 123);
		hm1.put("Vaishnavi", 345);
		hm1.put("Ishnavi", 899);
		System.out.println(hm1);
		Set s = hm1.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());			
		}
	}
}