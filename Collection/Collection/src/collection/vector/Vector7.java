package collection.vector;

import java.util.Vector;

public class Vector7 {

	public static void main(String[] args) {
	Vector v1 = new Vector(7); // --> User Defined capacity -- when we enter more than capacity it will automatcically double.
	v1.add('A');
	v1.add('B');
	v1.add('C');
	v1.add('D');
	v1.add(10);
	v1.add(20);
	v1.add(80);
	v1.add("Cyber");
	System.out.println(v1);
	System.out.println(v1.capacity());
	System.out.println(v1.size());
	}
}