// 01/09/23
class Const3{
	int a;
	Const3(){
		System.out.println("Inside Constructor 0 arg constructor "+a);
		this.a=100;
	}
	public static void main(String[] args){
		System.out.println("Start");
		Const3 s1 = new Const3();
		s1.m1();
		System.out.println("Stop");
	}
	void m1(){
		System.out.println("Inside m1 method, Non-Static variable of a is "+a);
	}
}
// ---------------------------
class Const4{
	int a;
	public static void main(String[] args){
		System.out.println("Start");
		System.out.println("Stop");
	}
}

// -----------------------------------
class EmployeeInfo{
	int EmpId;
	String EmpName;
	EmployeeInfo(int EmpId, String EmpName){
		System.out.println("Kindly wait setting Employee Information");
		this.EmpId=EmpId;
		this.EmpName=EmpName;
	}
	void EmployeeInfo(){
		System.out.println("Please wait fetching Employee information");
		System.out.println("Employee id is "+ EmpId+" Employee Name is "+EmpName);
	}
}

class Organization{
	public static void main(String[] args){
		System.out.println("Start");
		EmployeeInfo c1 = new EmployeeInfo(101, "Ram");
		c1.EmployeeInfo();
		System.out.println("-----------------------------------");
		EmployeeInfo c2 = new EmployeeInfo(201, "Sita");
		c2.EmployeeInfo();
		System.out.println("Stop");
	}
}