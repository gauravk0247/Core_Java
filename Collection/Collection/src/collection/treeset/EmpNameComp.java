package collection.treeset;

import java.util.Comparator;

public class EmpNameComp implements Comparator<Emp>{
	public int compare(Emp o1, Emp o2) {
		return o1.empName.compareTo(o2.empName);
	}
}