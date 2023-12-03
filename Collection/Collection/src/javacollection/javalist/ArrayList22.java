package javacollection.javalist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayList22 {

	public static void main(String[] args) {
		String[] str = {"Cyber", "Success", "Training"};
		List<String> l = Arrays.asList(str);
		ArrayList<String> a1 = new ArrayList<String>(l);
		System.out.println(a1);
		Iterator i = a1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}