package javacollection.javalist;

public class Emp implements Comparable<Emp>{
	int empId;
	String empName;
	Emp(int empId, String empName){
		this.empId=empId;
		this.empName=empName;
	}
	/*public int compareTo(Emp e) {
		//Emp e = (Emp)o;
		int retval = 0;
		if(empId==e.empId) {
			retval = 0;
		}
		else if(empId>e.empId) {
			retval = 1;
		}
		else if(empId<e.empId) {
			retval = -1;
		}
		return retval;
	}*/
	public int compareTo(Emp e) {
//		Emp e = (Emp)o;
		return empName.compareTo(e.empName);
	}
}