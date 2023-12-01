package javacollection.javalist;

import java.util.ArrayList;

public class ArrayList8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(10);
		a1.add("Cyber");
		a1.add(30.5f);
		System.out.println(a1);
		a1.remove("Cyber");
		System.out.println(a1);
		Integer i=10;
		a1.remove(i);
		System.out.println(a1);
	}

}
