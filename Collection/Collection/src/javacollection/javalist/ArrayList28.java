package javacollection.javalist;

import java.util.ArrayList;

public class ArrayList28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> a1 = new ArrayList<Emp>();
		a1.add(new Emp(101, "Cyber"));
		a1.add(new Emp(404, "Training"));
		a1.add(new Emp(303, "Success"));
		a1.add(new Emp(102, "Java"));
		for(Emp ee:a1) {
			System.out.println(ee.empId+" "+ee.empName);
		}
	}
}