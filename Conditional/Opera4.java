// 07/08/23
class Opera4{
	public static void main(String[] args)
	{
		int age = 22;
		char gender = 'M';
		if((age>=21 && gender=='M')||(age>=18 && gender=='F'))
		{
			System.out.println("You are eligible for Marriage");
		}
		else{
			System.out.println("You are not eligible");
			}
	}
}