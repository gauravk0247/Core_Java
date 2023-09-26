// 05/08/23
import java.util.Scanner;
class Opera8{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		if(num1>num2)
		{
			System.out.println("Num1 is greater");
		}
		else if(num1<num2)
		{
			System.out.println("num2 is greater");
		}
		else if(num1 == num2)
		{
			System.out.println("num1 and num2 are same");
		}
}
}		