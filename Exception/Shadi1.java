//28/10/23

class Shadi1{
	void marriageOfficer() throws InterruptedException{
		System.out.println("Inside marriageOfficer");
		Thread.sleep(3000);
	}
	void marriageAgent(){
		try{
		marriageOfficer();
		System.out.println("handled");
		}
		catch(Exception ae){
			System.out.println("handled");
		}
	}
	void marriageRagistar(){
		System.out.println("Inside marriageRagistar");
		marriageAgent();
	}
	public static void main(String[] args){
		Shadi1 acc1 = new Shadi1();
		acc1.marriageRagistar();
	}
}