package collection.treemap;

import java.util.Comparator;

public class EmpName implements Comparator<Emp>{
	@Override
	public int compare(Emp e1, Emp e2) {
		// TODO Auto-generated method stub
		return e1.empName.compareTo(e2.empName);
	}
	
}