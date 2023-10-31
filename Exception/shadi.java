//28/10/23
class Shadi{
	void marriageOfficer() throws InterruptedException{
		System.out.println("Inside marriageOfficer");
		Thread.sleep(3000);
	}
	void marriageAgent()throws InterruptedException{
		System.out.println("Inside marriageAgent");
		marriageOfficer();
	}
	void marriageRagistar() throws InterruptedException{
		System.out.println("Inside marriageRagistar");
		marriageAgent();
	}
	public static void main(String[] args) throws InterruptedException{
		Shadi acc1 = new Shadi();
		acc1.marriageRagistar();
	}
}