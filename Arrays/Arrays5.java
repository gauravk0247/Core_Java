class Arrays5{
	public static void main(String[] args){
		Emp e1 = new Emp(101, "Gaurav");
		Emp e2 = new Emp(202, "Krishna");
		Emp e3 = new Emp(303, "Krushna");
		Emp[] ee = new Emp[3];
		ee[0]=e1;
		ee[1]=e2;
		ee[2]=e3;
		for(int i=0;i<ee.length;i++){
			Emp e =ee[i];
			System.out.println(e.empId+" - "+e.empName);
		}
	}
}