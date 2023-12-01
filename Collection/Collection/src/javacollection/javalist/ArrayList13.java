package javacollection.javalist;

import java.util.ArrayList;

public class ArrayList13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Gaurav");
		a1.add("Ritik");
		a1.add("Krishna");
		// 1. Approach
		for(String s:a1) {
			String ss =(String)s;
			System.out.println(ss);
		}
		// 2. Approach
		String s11 = (String)a1.get(1);
		System.out.println(s11);
	}

}
