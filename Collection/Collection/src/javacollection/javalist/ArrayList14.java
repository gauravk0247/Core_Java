package javacollection.javalist;

import java.util.Enumeration;
import java.util.Vector;

public class ArrayList14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.add(100);
		v.add(200);
		v.add(300);
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
