package javacollection.javalist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList28 {

	public static void main(String[] args) {
		ArrayList<Emp> a1 = new ArrayList<Emp>();
		a1.add(new Emp(101, "Cyber"));
		a1.add(new Emp(404, "Training"));
		a1.add(new Emp(303, "Success"));
		a1.add(new Emp(102, "Java"));
		Collections.sort(a1);
		for(Emp ee:a1) {
			System.out.println(ee.empId+" "+ee.empName);
		}
	}
}