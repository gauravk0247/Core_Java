// 07/08/23
// Prime number in if else Condtion
class Opera8{
	public static void main(String[] args)
	{
		char signal = 'r';
		switch(signal)
		{
			case 'r':
			System.out.println("red, Stop");
			break;
			
			case 'g':
			System.out.println("green, Go");
			break;
			
			case 'y':
			System.out.println("Yellow go slow");
			break;
			
			default:
			System.out.println("Invalid");
		}
	}
}