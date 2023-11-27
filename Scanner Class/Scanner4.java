// 21/11/27
// ---> Pending
import java.util.Scanner;
class Scanner4{
	public static void main(String[] args){
		System.out.println("Start");
		Scanner s3 = new Scanner(System.in);
		while(s3.hasNext()){
			String str = (String)s3.next();
			if(str.equals("*")){
				System.exists(0);
			}
			System.out.println(str);
		}
		System.out.println("Stop");
	}
}