/*class Emp{
	int EmpId;
	String EmpName;
	Emp(int EmpId, String EmpName){
		this.EmpId=EmpId;
		this.EmpName=EmpName;
	}
}*/
class Emp{
	int EmpId;
	String EmpName;
	Emp(int EmpId, String EmpName){
		this.EmpId=EmpId;
		this.EmpName=EmpName;
	}
	public String toString(){
		return "IT an challange your tariner will win!";
	}
}
class Cyber{
	public static void main(String[] args){
		Emp e1 = new Emp(101, "Gaurav");
		System.out.println(e1);
		System.out.println(e1.toString());
	}
}