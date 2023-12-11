package collection.treeset;

import java.util.TreeSet;

public class TreeSet5 {

	public static void main(String[] args) {
		TreeSet ts1 = new TreeSet(new StringBuild());
		ts1.add(new StringBuilder("Hii"));
		ts1.add(new StringBuilder("Amber"));
		ts1.add(new StringBuilder("Cyber"));
		ts1.add(new StringBuilder("Tech"));
		System.out.println(ts1);
	}
}