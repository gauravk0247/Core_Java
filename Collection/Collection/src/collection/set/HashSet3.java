package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet3 {

	public static void main(String[] args) {
	HashSet hs1 = new HashSet();
	hs1.add("Cyber");
	hs1.add("Success");
	hs1.add("Training");
	Iterator<String> i = hs1.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	System.out.println(hs1);
	}
}