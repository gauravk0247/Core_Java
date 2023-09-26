// 30/08/23 
// pending
class Student{
	int studId;
	String studName;
	static String InstituteName = "Cyber Success";
	static void InstituteProcess(){
		System.out.println("Process for all student Demo + Admin + Training + Recruitment "+InstituteName);
	}
	void mockRatings(int ratings){
		System.out.println("studId "+ studId + " studName "+studName+" InstituteName "+InstituteName + " ratings "+ ratings);
	}
}
class CRMTrainingInstitute{
	public static void main(String[] args){
		Student c1 = new Student();
		c1.studId = 30;
		c1.studName = "Vaishnavi";
		c1.mockRatings(9);
		c1.InstituteProcess();
		c1.studId = 39;
		c1.studName = "Gaurav";
		c1.mockRatings(8);
		c1.InstituteProcess();
	}
}