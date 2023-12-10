package collection.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet2 {

	public static void main(String[] args) {
		LinkedHashSet lhs1 = new LinkedHashSet();
		lhs1.add('A');
		lhs1.add('B');
		lhs1.add('C');
		lhs1.add('D');
		System.out.println(lhs1);
		Iterator i1 = lhs1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}
}