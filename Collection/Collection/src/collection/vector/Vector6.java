package collection.vector;

import java.util.Vector;

public class Vector6 {

	public static void main(String[] args) {
	Vector v1 = new Vector();
	v1.add(100);
	v1.add(200);
	v1.add(300);
	System.out.println(v1);
	System.out.println(v1.capacity());
	System.out.println(v1.size());
	v1.add('x');
	v1.add('y');
	v1.add('z');
	v1.add("Cyber");
	v1.add("Success");
	v1.add("Training");
	v1.add(20.5f);
	v1.add(10.5f);
	v1.add(34.56f);
	System.out.println(v1);
	// bydefault its capacity is 10 When we insert values more than 10 or equal to 10 then the capacity is double.
	System.out.println(v1.capacity());
	}
}