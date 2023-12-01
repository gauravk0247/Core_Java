package javacollection.javalist;

import java.util.ListIterator;
import java.util.Vector;

public class ArrayList16 {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add('C');
		v.add('B');
		v.add('A');
		ListIterator i=v.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
