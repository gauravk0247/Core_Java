package hashmap.demos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap4 {

	public static void main(String[] args) {
		HashMap<Stud, Course> hm1 = new HashMap<Stud, Course>();
		hm1.put(new Stud(101, "Gaurav"), new Course(1, "Java"));
		hm1.put(new Stud(202, "Krishna"), new Course(2, "Python"));
		hm1.put(new Stud(303, "Ritik"), new Course(3, "Testing"));
		Set s = hm1.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext()) {
			Map.Entry<Stud, Course> hmp = (Map.Entry<Stud, Course>)i.next();
			Stud ss = hmp.getKey();
			Course cc = hmp.getValue();
			System.out.println(ss.studId+" - "+ss.studName);
			System.out.println(cc.courseId+" - "+cc.courseName);
		}
	}
}