package javacollection.javalist;

import java.util.ArrayList;

public class ArrayList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		a1.add(100);	 // --> toString -- Integer
		a1.add(200.5f);  // --> toString -- Float
		a1.add('x');	// --> toString -- Character
		System.out.println(a1);
	}

}
