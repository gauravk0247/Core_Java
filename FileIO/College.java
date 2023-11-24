import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.io.IOException;

class College{
	public static void main(String[] args) throws FileNotFoundException, IOException{
		Stud stud1 = new Stud(101, "Gaurav");
		FileOutputStream fos = new FileOutputStream("D:\\EmpInfo.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(stud1);
	}
}