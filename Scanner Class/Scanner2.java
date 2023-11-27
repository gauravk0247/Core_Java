// 27/11/23
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
class Scanner2{
	public static void main(String[] args) throws FileNotFoundException{
		File f1 = new File("ScanInfo.txt");
		Scanner s2 = new Scanner(f1);
		while(s2.hasNext()){
			System.out.println(s2.next());
		}
	}
}