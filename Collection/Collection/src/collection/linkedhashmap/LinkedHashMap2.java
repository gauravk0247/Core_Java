package collection.linkedhashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap2 {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
		hm.put(101, "Java");
		hm.put(202, "Python");
		hm.put(303, "Testing");
		System.out.println(hm);
		LinkedHashMap<Integer, String> hm1 = new LinkedHashMap<Integer, String>(hm);
		hm1.put(10, "A");
		hm1.put(20, "B");
		hm1.put(30, "C");
		System.out.println(hm1);
		LinkedHashMap<Integer, String> hm2 = new LinkedHashMap<Integer, String>();
		hm2.putAll(hm1);
		hm2.put(1, "P");
		hm2.put(2, "Q");
		hm2.put(3, "R");
		System.out.println(hm2);
		Set s = hm2.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext()) {
			Map.Entry<Integer, String> mp1 = (Map.Entry<Integer, String>)i.next();
			System.out.println(mp1.getKey()+" - "+mp1.getValue());
		}
	}
}