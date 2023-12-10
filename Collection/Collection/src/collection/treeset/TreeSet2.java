package collection.treeset;

import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
//		TreeSet<Emp> t1 = new TreeSet<Emp>(new EmpIdComp());
		TreeSet<Emp> t1 = new TreeSet<Emp>(new EmpNameComp());
		t1.add(new Emp(404, "Cyber"));
		t1.add(new Emp(202, "Success"));
		t1.add(new Emp(303, "Training"));
		t1.add(new Emp(101, "Java"));
		for(Emp ee:t1) {
			System.out.println(ee.empId+" "+ee.empName);
		}
	}
}