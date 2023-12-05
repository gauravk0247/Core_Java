package LinkList;

import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
	LinkedList l1 = new LinkedList();
	l1.add(100);
	l1.add(200.5);
	l1.add("Gaurav");
	l1.add('x');
	l1.add(true);
	System.out.println(l1);
	l1.add(2, "Patil");
	System.out.println(l1);
	System.out.println(l1.contains(true));
	l1.addFirst(10);
	System.out.println(l1);
	l1.addLast(false);
	System.out.println(l1);
	l1.clear();
	System.out.println(l1.isEmpty());
	}
}