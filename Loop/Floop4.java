// 09/08/23
class Floop4{
	public static void main(String[] args)
	{
		// initialization and declaration is not mandatory
		int i =1;
		for(; i<=10; i++)
		{
			System.out.println(i);
		}
	}
}

class Floop5{
	public static void main(String[] args)
	{
		int i = 1;
		for(System.out.println("Hello"),System.out.println("Hello"); i<=10; i++)
		{
			System.out.println(i);
		}
	}
}

class Floop6{
	public static void main(String[] args)
	{
		int i = 1;
		for(; i<=5; System.out.println("one"), System.out.println("two"))
		{
			System.out.println(i);
			i++;
		}
	}
}

class Floop7{
	public static void main(String[] args)
	{
		int i =1;
		// when we do not set the condition compiler set the condition bydefault the condition is true then is goes to the finite loop
		for(; ; i++)
		{
			System.out.println(i);
		}
	}
}

class Floop8{
	public static void main(String[] args)
	{
		int i = 1;
		for(; i<=10; System.out.println("One"))
		{
			
			System.out.println(i);
			// i++;
		}
	}
}

class Floop9{
	public static void main(String[] args)
	{
		int i = 1;
		{
			System.out.println(i); // 1
			System.out.println(i++);// 1 the againt it print add 1 --. 1+1=2
			System.out.println(i); // 2
			System.out.println(++i); // 3
		
		}
	}
}

class Floop10{
	public static void main(String[] args)
	{
		int i = 1;
		System.out.println("Hello");
	}
}		