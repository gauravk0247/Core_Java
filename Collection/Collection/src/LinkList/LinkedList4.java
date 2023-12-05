package LinkList;

import java.util.LinkedList;

public class LinkedList4 {

	public static void main(String[] args) {
	LinkedList l1 = new LinkedList();
	l1.add(100);
	l1.add(200);
	l1.add(300);
	System.out.println(l1);
	LinkedList l2 = new LinkedList(l1);
	l2.add("Cyber");
	l2.add("Success");
	l2.add("Training");
	System.out.println(l2);
	LinkedList l3 = new LinkedList();
	l3.addAll(l2);
	l3.add('A');
	l3.add('B');
	l3.add('C');
	System.out.println(l3);
	}
}