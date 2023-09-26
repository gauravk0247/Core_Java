// 10/08/23
class DoWhile1{
	public static void main(String[] args)
	{
		int i=1;
		while(i<=5)
		{
			if(i==3){
				System.out.println("Hello");
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
}			