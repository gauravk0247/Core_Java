import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.File;
import java.io.IOException;

class University{
	public static void main(String[] args) throws FileNotFoundException, IOException{
		File f = new File("EmpInfo.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Stud.s = (Stud)ois.readObject();
		System.out.println(s.studId+" - "+s.studName);
	}
}