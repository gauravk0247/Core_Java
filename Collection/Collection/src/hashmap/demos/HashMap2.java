package hashmap.demos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap2 {

	public static void main(String[] args) {
		HashMap hm1 = new HashMap();
		hm1.put(101, "Cyber");
		hm1.put(202, "Success");
		hm1.put(303, "Training");
		System.out.println(hm1);
		// For KeySet
		Set s = hm1.keySet();
		System.out.println(s);
		// For Values
		Collection c = hm1.values();
		System.out.println(c);
	}
}