package javacollection.javalist;

import java.util.Comparator;

public class EmpName implements Comparator {
	int retval=0;
	public int compare(Object o1, Object o2) {
		Emp e1 = (Emp)o1;
		Emp e2 = (Emp)o2;
		return e1.empName.compareTo(e2.empName);
	}
}