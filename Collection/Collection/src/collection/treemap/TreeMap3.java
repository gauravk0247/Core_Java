package collection.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap3 {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap(new EmpName());
		tm.put(new Emp(101, "Java"), "Training");
		tm.put(new Emp(202, "Python"), "Programming");
		tm.put(new Emp(303, "React"), "Front-end");
		Set s = tm.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext()) {
			Map.Entry mp1 = (Map.Entry)i.next();
			Emp ee = (Emp)mp1.getKey();
			String ss = (String)mp1.getValue();
			System.out.println(ee.empId+" - "+ee.empName+" - "+ss);
		}
	}
}