package javacollection.javalist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a11 = new ArrayList();
		a11.add(100);
		a11.add(200);
		a11.add(300);
		Iterator i =a11.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		// Generic Collection
		ArrayList<String> a12 = new ArrayList<String>();
		a12.add("A");
		a12.add("B");
		a12.add("C");
		Iterator i1 = a12.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

}
