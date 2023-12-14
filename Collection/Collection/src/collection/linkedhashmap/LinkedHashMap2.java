package collection.linkedhashmap;

import java.util.LinkedHashMap;

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
	}
}