// 28/11/23
class Arrays15{
	public static void main(String[] args){
		//Emp[][] emp = new Emp[3][3];
		Object[][] emp = new Object[3][3];
		emp[0][0]= 101;
		emp[1][0]= "Rahul";
		emp[2][0]= 10000.5f;
		emp[0][1]= 202;
		emp[1][1]= "Ram";
		emp[2][1]= 20000.5f;
		emp[0][2]= 303;
		emp[1][2]= "Sham";
		emp[2][2]= 30000.5f;
		
		for(int i=0;i<=2;i++){
			for(int j=0;j<=2;j++){
				System.out.print(" "+emp[i][j]);
			}
		System.out.println();
		}
	}
}