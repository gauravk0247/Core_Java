package javacollection.javalist;

import java.util.ArrayList;

public class ArrayList12 {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(100);
		a1.add(200);
		a1.add(300);
		// 1. Approach
		for(Object o:a1) {
			Integer i1 = (Integer)o;
			System.out.println(i1);
		}
		// 2. Approach
		Integer i2 = (Integer)a1.get(0);
		System.out.println(i2);
	}
}