package javacollection.javalist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLIst24 {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Cyber");
		a1.add("Success");
		a1.add("Trining");
		a1.add("Amber");
		a1.add("Java");
		a1.add("AdvJava");
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
	}
}