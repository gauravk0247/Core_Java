package javacollection.javalist;

import java.util.ArrayList;

public class ArrayList10 {

	public static void main(String[] args) {
		Emp e1 = new Emp(101, "Gaurav");
		Emp e2 = new Emp(202, "Krishna");
		Emp e3 = new Emp(303, "Ritik");
		Emp e4 = new Emp(404, "Sanika");
		Emp e5 = new Emp(505, "Krushna");
		Emp e6 = new Emp(606, "Darshan");
		ArrayList<Emp> a11 = new ArrayList<Emp>();
		a11.add(e1);
		a11.add(e2);
		// 1. Approach --> Constructor
		ArrayList<Emp> a12 = new ArrayList<>(a11);
		a12.add(e3);
		a12.add(e4);
		for(Emp e:a12) {
			System.out.println(e.empId+" "+e.empName);
		}
		System.out.println("-----------------");
		// 2. Approach --> all()
		ArrayList<Emp> a13 = new ArrayList<>();
		a13.add(e5);
		a13.add(e6);
		for(Emp e:a13) {
			System.out.println(e.empId+" "+e.empName);
		}
	}
}