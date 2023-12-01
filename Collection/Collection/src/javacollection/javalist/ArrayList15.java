package javacollection.javalist;

import java.util.Iterator;
import java.util.Vector;

public class ArrayList15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.add("A");
		v.add("B");
		v.add("C");
		Iterator i=v.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
