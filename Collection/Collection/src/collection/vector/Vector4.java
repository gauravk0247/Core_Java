package collection.vector;

import java.util.Vector;

public class Vector4 {

	public static void main(String[] args) {
	Vector v1 = new Vector();
	v1.add(10);
	v1.add(20);
	v1.add(30);
	System.out.println(v1);
	System.out.println(v1.capacity());
	System.out.println(v1.size());
	}
}