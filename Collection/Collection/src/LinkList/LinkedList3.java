package LinkList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList3 {

	public static void main(String[] args) {
	LinkedList<String> l1 = new LinkedList<String>();
	l1.add("A");
	l1.add("B");
	l1.add("C");
	l1.add("D");
	System.out.println(l1);
	Iterator i1 = l1.iterator();
	while(i1.hasNext()) {
		System.out.println(i1.next());
	}
	}
}