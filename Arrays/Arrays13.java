// 27/11/23
class Arrays13{
	public static void main(String[] args){
		Emp e1 = new Emp(101, "Cyber");
		Emp e2 = new Emp(202, "Success");
		Emp e3 = new Emp(303, "Training");
		Emp[] e = new Emp[5];
		e[0]=e1;
		e[2]=e2;
		e[4]=e3;
		for(int i=0;i<e.length;i++){
			if(e[i]==null){
				System.out.println("Index is "+i);
			}
			else{
				System.out.println("Employees is not present");
			}
		}
	}
}