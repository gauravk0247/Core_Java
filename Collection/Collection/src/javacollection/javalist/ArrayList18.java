package javacollection.javalist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a11 = new ArrayList();
		a11.add(100.5f);
		a11.add(200.5f);
		// Normal Cursor
		Iterator i = a11.iterator();
		while(i.hasNext()) {
			Float f = (Float)i.next();
			System.out.println(f);
		}
		// Generic Collection
		ArrayList<String> a12 = new ArrayList<String>();
		a12.add("Gaurav");
		a12.add("Krushna");
		a12.add("Darshan");
		Iterator i1 = a12.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

}
