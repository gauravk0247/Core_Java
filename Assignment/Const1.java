// 01/09/23
// Business Logic Class
class StudentInfo{
	int StudId;
	string StudName;
	string StudCourse;
	StudInfo(){
		System.out.println("Plase wait fetching Student info");
		System.out.println("Student Id is "+StudId+" Student Name "+StudName+" Student Course "+StudCourse);
	}
}
class CyberSuccess{
	public static void main(String[] args){
		System.out.println("Start");
		StudentInfo v1 = new StudentInfo();
		v1.StudInfo(100, "Gaurav", "Full Stack Java");
		System.out.println("Stop");
	}
}