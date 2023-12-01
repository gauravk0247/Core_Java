package javacollection.javalist;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> a11 = new ArrayList<Character>();
		a11.add('D');
		a11.add('C');
		a11.add('B');
		a11.add('A');
		ListIterator i =a11.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("----------------------");
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
	}

}
