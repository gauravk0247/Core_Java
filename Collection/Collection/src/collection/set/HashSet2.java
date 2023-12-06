package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
	public static void main(String[] args) {
		HashSet hs1 = new HashSet();
		hs1.add(10);
		hs1.add(20);
		hs1.add(30);
		hs1.add('X');
		hs1.add('Y');
		hs1.add('Z');
		Iterator i = hs1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(hs1);
	}
	
}