package hashmap.demos;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap hm1 = new HashMap();
		hm1.put(101, "A");
		hm1.put(202, "B");
		hm1.put(303, "C");
		System.out.println(hm1);
		hm1.put(101,  "D");
		System.out.println(hm1);
		hm1.put(3, "X");
		hm1.put(67, "X");
		hm1.put(8, "X");
		System.out.println(hm1);
	}
}