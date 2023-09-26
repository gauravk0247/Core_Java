// 10/08/23
class Floop7{
	public static void main(String[] args)
	{
		for(int i=1;i<=3; i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*" +" ");
			}
			System.out.println();
		}
	}
}

class Floop8{
	public static void main(String[] args)
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

class Floop9{
	public static void main(String[] args)
	{
		int z = 1;
		for(int i=1; i<=3; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(z+++ " ");
			}
				System.out.println();
		}
	}
}