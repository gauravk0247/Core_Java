package javacollection.javalist;

import java.util.ArrayList;

public class ArrayList23 {

	public static void main(String[] args) {
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(100);
		i.add(200);
		i.add(300);
		i.add(400);
		i.add(500);
		// Pending
		Integer[] ii = i.toArray(new Integer[i.size()]);
		for(int j=0;j<ii.length;j++) {
			System.out.println(j[ii]);
		}
	}
}