// 23/11/23
import java.io.Serializable;

class Stud implements Serializable {
	int studId;
	String studName;
	Stud(int studId, String studName){
		this.studId=studId;
		this.studName=studName;
	}
}