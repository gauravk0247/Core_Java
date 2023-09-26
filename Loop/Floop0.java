// 10/08/23
// 1
// 2 3
// 4 5 6

class Floop1{
	public static void main(String[] args)
	{
		int z = 1;
		for(int i=1;i<=3; i++)
		{
			for(int j=1;j<=i; j++)
			{
				System.out.print(z +" ");
				z=z+1;
			}
				System.out.println();
		}
	}
}