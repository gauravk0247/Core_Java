package collection.treeset;

import java.util.Comparator;

public class EmpIdComp implements Comparator<Emp>{
	public int compare(Emp o1, Emp o2) {
	int resval = 0;
	if(o1.empId==o2.empId) {
		resval=0;
		}
	else if(o1.empId>o2.empId) {
		resval=1;
	}
	else if(o1.empId<o2.empId) {
		resval=-1;
	}
	return resval;
	}
}