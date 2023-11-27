// 27/11/23
class Arrays12{
	public static void main(String[] args){
		Emp e1 = new Emp(101, "Cyber");
		Emp e2 = new Emp(202, "Success");
		Emp e3 = new Emp(303, "Training");
		Emp[] e = new Emp[5];
		e[0]=e1;
		e[2]=e2;
		e[4]=e3;
		for(Emp ee:e){
			if(ee!=null){
				System.out.println(ee.empId+" - "+ee.empName);
			}
			else{
				System.out.println("Employees is not present");
			}
		}
	}
}