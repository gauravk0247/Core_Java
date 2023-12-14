package collection.linkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {

	public static void main(String[] args) {
	LinkedHashMap lhm1 = new LinkedHashMap();
	lhm1.put(100, "A");
	lhm1.put(200, "B");
	lhm1.put(300, "C");
	System.out.println(lhm1);
	System.out.println(lhm1.get(2));
	lhm1.put(1, "X");
	lhm1.put(2, "Y");
	lhm1.put(3, "Z");
	lhm1.get(2);
	System.out.println(lhm1);
	}
}