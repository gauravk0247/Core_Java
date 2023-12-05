package collection.vector;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
	Vector v1 = new Vector();
	v1.add("A");
	v1.add(100);
	v1.add(200);
	v1.add(300.5);
	v1.add(true);
	v1.add('x');
	System.out.println(v1);
	}
}