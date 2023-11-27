// 27/11/27
import java.util.Scanner;
class Scanner3{
	public static void main(String[] args){
		System.out.println("Start");
		Scanner s1 = new Scanner(System.in);
		while(s1.hasNext()){
			System.out.println(s1.next());
		}
		System.out.println("Stop");
	}
}