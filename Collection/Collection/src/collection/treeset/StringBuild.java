package collection.treeset;

import java.util.Comparator;

public class StringBuild implements Comparator<StringBuilder>{

	@Override
	public int compare(StringBuilder o1, StringBuilder o2) {
		String st1 = o1.toString();
		String st2 = o2.toString();
		return st1.compareTo(st2);
	}
}