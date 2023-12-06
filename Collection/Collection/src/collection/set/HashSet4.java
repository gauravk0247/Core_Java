package collection.set;

import java.util.HashSet;

public class HashSet4 {

	public static void main(String[] args) {
		HashSet hs1 = new HashSet();
		hs1.add(10);
		hs1.add(20);
		hs1.add(30);
		System.out.println(hs1);
		HashSet hs2 = new HashSet(hs1);
		hs2.add('X');
		hs2.add('Y');
		hs2.add('Z');
		System.out.println(hs2);
		HashSet hs3 = new HashSet();
		hs3.addAll(hs1);
		hs3.add("Cyber");
		hs3.add("Success");
		hs3.add("Training");
		System.out.println(hs3);
	}
}