package javacollection.javalist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList21 {

	public static void main(String[] args) {
		ArrayList<Emp> a1 = new ArrayList<Emp>();
		a1.add(new Emp(101, "Cyber"));
		a1.add(new Emp(202, "Success"));
		a1.add(new Emp(303, "Training"));
		a1.add(new Emp(404, "Java"));
		ListIterator<Emp> i = a1.listIterator();
		while(i.hasNext()) {
			Emp e = i.next();
			System.out.println(e.empId+" "+e.empName);
			if(e.empName.equals("Training")) {
				i.remove();				
			}
		}
		System.out.println("-------------------------");
		ListIterator<Emp> i1 = a1.listIterator();
		while(i1.hasNext()) {
			Emp e = i1.next();
			System.out.println(e.empId+" "+e.empName);
			if(e.empName.equals("Java")) {
				i1.set(new Emp(505, "Advanced Java"));
			}
		}
		System.out.println("-------------------");
		for(Emp ee:a1) {
			System.out.println(ee.empId+" - "+ee.empName);
		}
	}
}