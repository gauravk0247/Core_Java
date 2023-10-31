// 30/10/23
class Shadi2{
	void marriageOfficer() throws InterruptedException{
		System.out.println("Inside marriageOfficer");
		Thread.sleep(3000);
	}
	void marriageAgent(){
		System.out.println("Inside marriageAgent");
		try{
			marriageOfficer();
			System.out.println("Handle it");
		}
		catch(InterruptedException ie){
			System.out.println("Alternative way to Handle it ");
		}
	}
	void marriageRegistar(){
		System.out.println("Inside marriageRegistar");
		marriageAgent();
	}
	
	public static void main(String[] args){
		System.out.println("Inside main marriage");
		Shadi2 acc1 = new Shadi2();
		acc1.marriageRegistar();
	}
}