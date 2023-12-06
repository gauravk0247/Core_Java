package collection.vector;

import java.util.Iterator;
import java.util.Vector;

public class Vector3 {

	public static void main(String[] args) {
		Vector<String> v1 = new Vector<String>();
		v1.add("Developer");
		v1.add("Java");
		Iterator i = v1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}		System.out.println(v1);
	}
}