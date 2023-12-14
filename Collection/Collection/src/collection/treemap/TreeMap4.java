package collection.treemap;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap4 {

	public static void main(String[] args) {
		TreeMap t1 = new TreeMap();
		t1.put(222, "X");
		t1.put(333, "Y");
		t1.put(111, "Z");
		t1.put(444, "P");
		t1.put(555, "Q");
		System.out.println(t1);
		SortedMap sm = t1.headMap(333);
		System.out.println(sm);
		SortedMap sm1 = t1.tailMap(333);
		System.out.println(sm1);
	}
}