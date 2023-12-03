package javacollection.javalist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList20 {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(100);
		a1.add(200);
		a1.add(300);
		a1.add(400);
		a1.add(500);
		System.out.println(a1);
		Iterator i=a1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			i.remove();
		}
		System.out.println(a1);
	}
}