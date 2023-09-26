// 01/09/23
// Business Logic Class
class StudentInfo{
	int StudId;
	String StudName;
	//String StudCourse;
	StudentInfo(int StudId, String StudName){
		System.out.println("Kindly wait setting Student Information");
		this.StudId=StudId;
		this.StudName=StudName;
		//this.StudCourse=StudCourse;
	}
	void StudInfo(){
		System.out.println("Plase wait fetching Student info");
		System.out.println("Student Id is "+StudId+" Student Name "+StudName);
	}
}
class CyberSuccess{
	public static void main(String[] args){
		System.out.println("Start");
		StudentInfo v1 = new StudentInfo(100, "Krishna");
		v1.StudInfo();
		System.out.println("--------------------------------------");
		StudentInfo v2 = new StudentInfo(200, "Gaurav");
		v1.StudInfo();
		System.out.println("Stop");
	}
}