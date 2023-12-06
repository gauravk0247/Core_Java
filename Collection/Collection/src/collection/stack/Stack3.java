package collection.stack;

import java.util.Stack;

public class Stack3 {

	public static void main(String[] args) {
	Stack s1 = new Stack();
	s1.push('A');
	s1.push('B');
	s1.push('C');
	System.out.println(s1);
	System.out.println(s1.search('A'));
	System.out.println(s1.search('B'));
	System.out.println(s1.empty());
	s1.clear();
	System.out.println(s1);
	System.out.println(s1.empty());
	}
}