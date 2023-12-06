package collection.set;

import java.util.HashSet;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
	HashSet hs1 = new HashSet();
	hs1.add(100);
	hs1.add(true);
	hs1.add(null);
	hs1.add(20.5f);
	hs1.add('X');
	System.out.println(hs1);
	}
}