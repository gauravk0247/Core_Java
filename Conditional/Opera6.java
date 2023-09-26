// 07/08/23
class Opera6{
	public static void main(String[] args)
	{
		char signal = 'y';
		if(signal=='r')
		{
			System.out.println("Stop");
		}
		else if(signal=='g')
		{
			System.out.println("Go");
		}
		else if(signal=='y')
		{
			System.out.println("Slow down");
		}
		else{
			System.out.println("Invalid");
		}
	}
}