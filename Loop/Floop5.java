// 10/08/23
// print the star pattern using the nested for loop
// *
// * *
// * * *
class Floop5{
	public static void main(String[] args)
	{
		int n = 3;
		for(int i=1;i<=n;i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}