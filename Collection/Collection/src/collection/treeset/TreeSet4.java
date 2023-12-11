package collection.treeset;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet4 {

	public static void main(String[] args) {
		TreeSet ts1 = new TreeSet();
		ts1.add(400);
		ts1.add(300);
		ts1.add(100);
		ts1.add(250);
		SortedSet ss1 = ts1.headSet(300);
		System.out.println(ss1);
		TreeSet ts2 = new TreeSet(ss1);
		Iterator i = ts2.iterator();
		while(i.hasNext()) {
			Integer ii = (Integer)i.next();
			System.out.println(ii);
		}
	}
}