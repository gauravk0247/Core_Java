import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.File;
import java.io.IOException;
			Stud s = (Stud)ois.readObject();

class University{
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		File f = new File("EmpInfo.txt");
		if(f.exists()) {
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			System.out.println(s.studId+" - "+s.studName);
		} else {
			System.out.println("File not exists!!!");
		}
	}
}