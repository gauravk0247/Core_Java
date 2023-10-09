// 09/10/23
interface HDFCaccount{
	void bankAccount();
}
interface HDFCloans extends HDFCaccount{
	void bankloan();
}
class HDFC_Customer1 implements HDFCaccount{
	public void bankAccount(){
		System.out.println("inside saving account");
	}
	public static void main(String[] args){
		HDFCaccount cust1 = new HDFC_Customer1();
		cust1.bankAccount();
	}
}
class HDFC_Customer2 implements HDFCloans{
	public void bankAccount(){
		System.out.println("Inside current account");
	}
	public void bankloan(){
		System.out.println("Inside business loan account");
	}
	public static void main(String[] args){
		HDFCloans cust2 = new HDFC_Customer2();
		cust2.bankAccount();
		cust2.bankloan();
	}
}