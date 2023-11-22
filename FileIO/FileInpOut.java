// 22/11/23
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;

class FileInpOut{
	public static void main(String[] args)throws FileNotFoundException, IOException{
		FileInputStream fis = new FileInputStream("D:\\Input.txt");
		FileOutputStream fos = new FileOutputStream("D:\\Output.txt");
		int info;
		while((info=fis.read())!=-1){
			System.out.println(" "+(char)info);
			fos.write(info);
		}
		fis.close();
		fos.close();
	}
}