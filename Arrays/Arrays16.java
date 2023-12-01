// 28/11/23
class Arrays16{
	public static void main(String[] args){
		Object[][] emp = new Object[3][3];
		emp[0][0]= new Emp(101);
		emp[1][0]= new Emp("Rahul");
		emp[2][0]= new Emp(10000.5f);
		emp[0][1]= new Emp(202);
		emp[1][1]= new Emp("Ram");
		emp[2][1]= new Emp(20000.5f);
		emp[0][2]= new Emp(303);
		emp[1][2]= new Emp("Sham");
		emp[2][2]= new Emp(30000.5f);
		
		for(int i=0;i<=2;i++){
			for(int j=0;j<=2;j++){
				System.out.print(" "+emp[i][j]);
			}
		System.out.println();
		}
	}
}