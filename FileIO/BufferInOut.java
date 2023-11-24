// 23/11/23
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

class BufferInOut{
	public static void main(String[] args) throws FileNotFoundException, IOException{
		// Read
		FileInputStream fis = new FileInputStream("D:\\BufferInput.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		// Write
		FileOutputStream fos = new FileOutputStream("D:\\BuffOut.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int info;
		while((info=bis.read())!=-1){
			System.out.println((char)info);
			bos.write(info);
		}
		bos.flush();
		fis.close();
		bis.close();
		fos.close();
		bos.close();
	}
}