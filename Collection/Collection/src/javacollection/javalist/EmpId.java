package javacollection.javalist;

import java.util.Comparator;

public class EmpId implements Comparator{
	public int compare(Object o1, Object o2) {
		int retval = 0; 
		Emp e1 = (Emp)o1;
		Emp e2 = (Emp)o2;
		if(e1.empId=e2.empName) {
			retval = 0;
		}
		else if(e1.empId>e2.empId) {
			retval = 1;
		}
		else if(e1.empId<e2.empId) {
			retval = -1;
		}
		return retval;
	}
}
