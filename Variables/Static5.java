// 11/08/23
class Static5{
	static int a;
	public static void main(String[] args)
	{
		// int a;
		{
			System.out.println(a);
		}
	}
}

class Floop1{
	public static void main(String[] args)
	{
		int z = 1;
		for(int i=1;i<=3;i++)
		{
			for(int j =1;j<=i;j++)
			{
				System.out.print(z++ +" ");
			}
			System.out.println();
		}
	}
}

class Floop2{
	public static void main(String[] args)
	{
		for(int i=3;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}

class Floop3{
	public static void main(String[] args)
	{
		for(int i=3;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
/* 1 2 3
   1 2
   1
   */