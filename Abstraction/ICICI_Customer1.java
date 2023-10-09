// 09/10/23
interface ICICIBankAccount{
	void bankAccount();
}
interface ICICIBankLoan{
	void bankLoan();
}
interface ICICIBankInsurance extends ICICIBankAccount, ICICIBankLoan{
	void bankInsurance();
}
class ICICI_Customer1 implements ICICIBankInsurance{
	public void bankAccount(){
		System.out.println("Inside Saving Account");
	}
	public void bankLoan(){
		System.out.println("Inside bank loan");
	}
	public void bankInsurance(){
		System.out.println("Inside ICICI insurance");
	}
	public static void main(String[] args){
		ICICIBankInsurance cust1 = new ICICI_Customer1();
		// Overriding
		cust1.bankAccount();
		cust1.bankLoan();
		// simple Inheritance
		ICICI_Customer1 cust2 = new ICICI_Customer1();
		System.out.println("--------------------------------");
		cust2.bankAccount();
		cust2.bankLoan();
	}
}