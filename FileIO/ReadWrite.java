// 22/11/23
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

class ReadWrite{
	public static void main(String[] args) throws FileNotFoundException, IOException{
		FileReader fr = new FileReader("D:\\Reader.txt");
		FileWriter fw = new FileWriter("D:\\Writer.txt");
		int info;
		while((info=fr.read())!=-1)
		{
			System.out.println(" "+(char)info);
			fw.write(info);
		}
		fr.close();
		fw.close();	
	}
}