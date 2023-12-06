package collection.stack;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
	Stack s1 = new Stack();
	s1.push(20);
	s1.push("10");
	s1.push('X');
	s1.push(true);
	s1.push(34.67f);
	s1.push(null);
	System.out.println(s1);
	System.out.println(s1.capacity());
	}
}