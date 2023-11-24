// 22/11/23
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

class BufferReadWrite{
	public static void main(String[] args) throws FileNotFoundException, IOException{
		// Read
		FileReader fr = new FileReader("D:\\BufferReader.txt");
		BufferedReader br = new BufferedReader(fr);
		// Write
		FileWriter fw = new FileWriter("D:\\BufferWriter.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		int info;
		while((info=br.read())!=-1){
			System.out.println((char)info);
			bw.write(info);
		}
		bw.flush();
		fr.close();
		br.close();
		fw.close();
		bw.close();
	}
}