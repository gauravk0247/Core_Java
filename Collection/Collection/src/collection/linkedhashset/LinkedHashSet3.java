package collection.linkedhashset;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedHashSet3 {

	public static void main(String[] args) {
		LinkedHashSet lhs1 = new LinkedHashSet();
		lhs1.add(200);
		lhs1.add(100);
		lhs1.add('x');
		lhs1.add("Cyber");
		lhs1.add(null);
		System.out.println(lhs1);
		LinkedHashSet lhs2 = new LinkedHashSet(lhs1);
		lhs2.add('A');
		lhs2.add('B');
		System.out.println(lhs2);
		LinkedList lhs3 = new LinkedList();
		lhs3.addAll(lhs2);
		lhs3.add("New");
		lhs3.add("Journey");
		lhs3.add("Start");
		System.out.println(lhs3);
		ListIterator i1 = lhs3.listIterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}
}