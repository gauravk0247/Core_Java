// 05/08/23
import java.util.Scanner;
class Opera9{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1 is "+num1);
		System.out.println("num2 is "+num2);
	}
}