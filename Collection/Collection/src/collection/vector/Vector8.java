package collection.vector;
import java.util.Vector;
public class Vector8 {

	public static void main(String[] args) {
		Vector v1 = new Vector(5, 7);
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add('X');
		v1.add('Y');
		System.out.println(v1);
		System.out.println(v1.capacity());
		System.out.println(v1.size());
		v1.add(34.56f);
		v1.add(50.56f);
		System.out.println(v1.capacity());
	}
}