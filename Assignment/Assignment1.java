// 08/09/23
// Q Write a program to print the pattern
// * * *
//  * *
//   *
class Assignment1{
	public static void main(String[] args){
		for(int i=1;i<=3;i++)
		{
			for(int k=1;k<=i;k++){
				System.out.print(" ");
				
			}
			for(int j=3;j>=i;j--){
				
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}