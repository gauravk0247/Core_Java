package collection.vector;

import java.util.Vector;

public class Vector5 {

	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add(100);
		v1.add(200);
		v1.add(300);
		System.out.println(v1);
		System.out.println(v1.capacity());
		System.out.println(v1.clone());
		System.out.println(v1.containsAll(v1));
		System.out.println(v1.lastElement());
		System.out.println(v1.firstElement());
//		System.out.println(v1.removeAll(v1));
		System.out.println(v1.size());
	}
}