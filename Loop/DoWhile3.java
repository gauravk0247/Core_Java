// 12/08/23
class DoWhile3{
	public static void main(String[] args)
	{
		int i = 1;
		do{
			if(i==3){
				continue;
			}
			System.out.println(i);
			i++;
		}while(i<=10);
	}
}