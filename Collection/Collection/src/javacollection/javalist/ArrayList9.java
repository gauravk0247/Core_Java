package javacollection.javalist;

import java.util.ArrayList;

public class ArrayList9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20.5f);
		a1.add(true);
		a1.add("Cyber");
		System.out.println(a1);
		a1.add(2, 100);
		System.out.println(a1);
		System.out.println(a1.contains("Cyber"));
		System.out.println(a1.contains("Success"));
		System.out.println(a1.isEmpty());
		a1.clear();
		System.out.println(a1.isEmpty());
	}

}
