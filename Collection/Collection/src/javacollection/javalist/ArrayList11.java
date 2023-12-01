package javacollection.javalist;

import java.util.ArrayList;

public class ArrayList11 {

	public static void main(String[] args) {
		Emp e1 = new Emp(101, "Gaurav");
		Emp e2 = new Emp(202, "Krishna");
		Emp e3 = new Emp(303, "Ritik");
		Emp e4 = new Emp(404, "Sanika");
		ArrayList<Emp> a11 = new ArrayList<Emp>();
		a11.add(e1);
		a11.add(e2);
		ArrayList<Emp> a12 = new ArrayList<>(a11);
		a12.add(e3);
		a12.add(e4);
		System.out.println(a12.containsAll(a11));
		System.out.println(a12.contains(e1));
		a12.remove(e1);
		System.out.println(a12.containsAll(a11));
		System.out.println(a12.contains(e1));
		a12.remove(a11);
		for(Emp e:a12) {
			System.out.println(e.empId+" "+e.empName);
		}
		a12.retainAll(a11);
		System.out.println(a12);
	}

}
