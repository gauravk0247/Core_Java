package javacollection.javalist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLIst25 {

	public static void main(String[] args) {
	ArrayList a1 = new ArrayList();
	a1.add(500);
	a1.add(200);
	a1.add(300);
	a1.add(400);
	System.out.println(a1);
	Collections.sort(a1);
	System.out.println(a1);
	}
}