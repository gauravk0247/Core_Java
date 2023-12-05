package javacollection.javalist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList27 {

	public static void main(String[] args) {
	ArrayList<Emp> a1 = new ArrayList();
	a1.add(new Emp(101, "Cyber"));
	a1.add(new Emp(202, "Success"));
	a1.add(new Emp(303, "Java"));
	a1.add(new Emp(404, "Training"));
	Collections.sort(a1, new EmpName());
	for(Emp e:a1) {
		System.out.println(e.empId+" - "+e.empName);
	}
	}
}