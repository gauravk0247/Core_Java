// 05/08/23
import java.util.Scanner;
class Opera7{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of a");
		int num1 = s.nextInt();
		System.out.println("Enter value of b");
		int num2 = s.nextInt();
		if(num1>num2)
		{
			System.out.println("num1 is Greater");
		}
		else if(num1<num2){
			System.out.println("num2 is Greater");
		}
		else if(num1==num2)
		{
			System.out.println("num1 and num2 are same");
		}
	}
}