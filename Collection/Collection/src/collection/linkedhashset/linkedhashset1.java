package collection.linkedhashset;

import java.util.LinkedHashSet;

public class linkedhashset1 {

	public static void main(String[] args) {
		LinkedHashSet lhs1 = new LinkedHashSet();
		lhs1.add(100);
		lhs1.add(200.5f);
		lhs1.add("Cyber");
		lhs1.add('X');
		lhs1.add(null);
		System.out.println(lhs1);
	}
}