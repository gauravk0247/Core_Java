// 22/11/23
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class FileInpOut{
	public static void main(String[] args)throws FileNotFoundException, IOException{
		FileInputStream fis = new FileInputStream("D:\\Input.txt");
		int info;
		while((info=fis.read())!=-1){
			System.out.println(" "+(char)info);
		}
	}
}