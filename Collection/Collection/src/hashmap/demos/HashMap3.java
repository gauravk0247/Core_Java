package hashmap.demos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap3 {

	public static void main(String[] args) {
		HashMap hm1 = new HashMap();
		hm1.put(101, "P");
		hm1.put(202, "Q");
		hm1.put(303,  "R");
		System.out.println(hm1);
		// For Extracting we used entrySet()
		Set s = hm1.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext()) {
			Map.Entry mp1 = (Map.Entry)i.next();
			System.out.println(mp1.getKey()+" - "+mp1.getValue());
		}
	}
}