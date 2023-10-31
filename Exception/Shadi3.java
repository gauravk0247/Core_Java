// 30/10/23
class Shadi3{
	void marriageOfficer(){
		System.out.println("Inside marriageOfficer");
		try{
			Thread.sleep(3000);
		}
		catch(InterruptedException ai){
			System.out.println("Inside catch block");
		}
		
	}
	void marriageAgent(){
		System.out.println("Inside marriageAgent");
		marriageOfficer();
	}
	void marriageRagistar(){
		System.out.println("Inside marriageRagistar");
		marriageAgent();
	}
	public static void main(String[] args){
		Shadi3 acc1 = new Shadi3();
		acc1.marriageRagistar();
	}
}