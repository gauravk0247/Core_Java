package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

class NotValidStudentException extends Exception{
	String errorMsg;
	String errorDate;
	public NotValidStudentException(String errorMsg, String errorDate) {
		super();
		this.errorMsg = errorMsg;
		this.errorDate = errorDate;
		System.out.println(errorMsg+" "+errorDate);
	}
}
class Student{
	private int roll_number;
	private String name;
	private String collegeName;
	private long phone;
	public Student(int roll_number, String name, String collegeName, long phone) {
		super();
		this.roll_number = roll_number;
		this.name = name;
		this.collegeName = collegeName;
		this.phone = phone;
	}
	public int getRoll_number() {
		return roll_number;
	}
	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
}
public class TestOptionalDemo4 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Gaurav", "SVIT", 12345));
		list.add(new Student(2, "Krishna", "BIT", 56789));
		list.add(null);
		list.add(new Student(3, "Krushna", "PICT", 29123));
		
		Optional<Student> opt = null;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your roll number");
		int rno = s.nextInt();
		
		for(Student student:list) {
			opt = Optional.ofNullable(student);
			if(opt.isPresent()) {
				Student obj = opt.get();
				if(obj.getRoll_number()==rno) {
					System.out.println(obj);
					break;
				}
				else {
					opt.orElse(()-> new NotValidStudentException("Not Valid", new Date()));
				}
			}
			else {
				Student defaultobj = opt.orElse(new Student(108, "Darshan", "AVCOE", 19472));
				System.out.println(defaultobj);
			}
		}
	}
}