// 27/11/27
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;
class Scanner6{
	public static void main(String[] args) throws FileNotFoundException{
		FileReader fr = new FileReader("FileReader.txt");
		Scanner s6 = new Scanner(fr);
		while(s6.hasNext()){
			System.out.println(s6.next());
		}
	}
}