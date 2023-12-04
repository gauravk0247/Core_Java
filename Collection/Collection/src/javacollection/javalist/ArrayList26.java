package javacollection.javalist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList26 {

	public static void main(String[] args) {
		ArrayList<Emp> a1 = new ArrayList<Emp>();
		a1.add(new Emp(101, "Gaurav"));
		a1.add(new Emp(202, "Success"));
		a1.add(new Emp(303, "Training"));
		System.out.println(a1); 
		Collections.sot(a1); // --> It is not applicable to custom object
		System.out.println(a1);	
	}
}