package hashmap.demos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap6 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		hm1.put(101, "Gaurav");
		hm1.put(202, "Darshan");
		hm1.put(303, "Krishna");
		System.out.println(hm1);
		Set s = hm1.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext()) {
			Map.Entry mp1 = (Map.Entry)i.next();
			System.out.println(mp1.getKey()+" - "+mp1.getValue());
		}
	}
}