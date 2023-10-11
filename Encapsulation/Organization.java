// 11/10/23
class Emp{
	private int empID;
	private String empDept;
	private float empSal;
	Emp(int empID, String empDept, float empSal){
		this.empID=empID;
		this.empDept=empDept;
		this.empSal=empSal;
	}
	public void getEmpInfo(){
		System.out.println("Emp Id "+empID+" Emp Dept "+empDept+" Emp Sal "+empSal);
	}
	public void setEmpSal(float empSal){
		this.empSal=empSal;
	}
	public void setEmpDept(String empDept){
		this.empDept=empDept;
	}
	public void setEmpID(int empID){
		this.empID=empID;
	}
}
class Organization{
	public static void main(String[] args){
		Emp t1 = new Emp(101, " Developer ", 20000);
		t1.getEmpInfo();
		System.out.println("--------------------");
		t1.setEmpSal(100000);
		t1.setEmpDept("Application Developer");
		t1.setEmpID(303);
		t1.getEmpInfo();
		System.out.println("-------------------");
		Emp t2 = new Emp(202, "Teasting", 1000);
		t2.getEmpInfo();
		System.out.println("------------------------");
		t2.setEmpID(404);
		t2.setEmpDept(" Networking ");
		t2.setEmpSal(300);
		t2.getEmpInfo();
	}
}