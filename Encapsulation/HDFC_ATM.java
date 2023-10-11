// 11/10/23
class HDFC_Server{
	private float bal=5000.0f; //datamember
	public float getbal(){
		return bal;
	}
	public void transferAmount(float trfAmount){
		bal=bal-trfAmount;
	}
	public void depositAmount(float depAmount){
		bal=bal+depAmount;
	}
}
class HDFC_ATM{
	public static void main(String[] args){
		HDFC_Server cust1 = new HDFC_Server();
		float atmBal = cust1.getbal();
		System.out.println(atmBal);
		cust1.transferAmount(2000);
		atmBal=cust1.getbal();
		cust1.depositAmount(1000);
		atmBal = cust1.getbal();
		System.out.println(atmBal);
	}
}