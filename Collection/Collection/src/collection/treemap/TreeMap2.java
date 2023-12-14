package collection.treemap;

import java.util.TreeMap;

public class TreeMap2 {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(11, "Krishna");
		tm.put(44, "Darshan");
		System.out.println(tm);
		TreeMap<Integer, String> tm1 = new TreeMap<Integer, String>(tm);
		tm1.put(3, "Java");
		tm1.put(2, "Python");
		tm1.put(1, "Testing");
		System.out.println(tm1);
		TreeMap<Integer, String> tm2 = new TreeMap<Integer, String>();
		tm2.putAll(tm1);
		tm2.put(303, "Developer");
		tm2.put(202, "Front-End");
		tm2.put(101, "Back-End");
		System.out.println(tm2);
	}
}