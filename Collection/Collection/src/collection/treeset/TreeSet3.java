package collection.treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet3 {

	public static void main(String[] args) {
		TreeSet ts1 = new TreeSet();
		ts1.add(300);
		ts1.add(400);
		ts1.add(200);
		ts1.add(100);
		System.out.println(ts1);
		SortedSet ss1 = ts1.headSet(300);
		System.out.println(ss1);
		SortedSet ss2 = ts1.tailSet(300);
		System.out.println(ss2);
	}
}