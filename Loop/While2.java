// 10/08/23
// in Do while loop it is mandatory to define the condition without condition the shows an error
class While2{
	public static void main (String[] args)
	{
		int i = 1;
		while(i<=5){
		System.out.println(i);
		i++;
		}
	}
}

class While3{
	public static void main(String[] args)
	{
		int j = 1;
		while(j<=10)
		{
			if(j==5){
				System.out.println("Inside the while loop" + j);
				j++;	
			}
			break;
		}
	}
}

class While4{
	public static void main(String[] args)
	{
		int i = 5;
		while(i>=1)
		{
			System.out.println(i);
			i--;
		}
	}
}

class While5{
	public static void main(String[] args)
	{
		int i = 1;
		while(i<=10)
		{
			if(i==5)
			{
				System.out.println(i);
				break;
			}
			i++;
		}
	}
}