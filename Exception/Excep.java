// 31/10/23
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
class Excep1{
	static void m1() throws FileNotFoundException, InterruptedException{
		System.out.println("Inside m1 method");
		File f1 = new File("D:\\Test.txt");
		FileInputStream fi1 = new FileInputStream(f1);
		Thread.sleep(3000);
	}
	public static void main(String[] args){	
		m1();
	}
}