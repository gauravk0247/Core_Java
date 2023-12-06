package collection.vector;

import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add(100);
		v1.add(200);
		v1.add(300);
		System.out.println(v1);
		Vector v2 = new Vector(v1);
		v2.add("Full");
		v2.add("Stack");
		v2.add("Developer");
		System.out.println(v2);
		Vector v3 = new Vector();
		v3.addAll(v2);
		v3.add(true);
		v3.add('a');
		v3.add(20.45);
		System.out.println(v3);
	}
}