class HDFC{
	HDFC(String CustName, String PAN){
		System.out.println("Please wait creating saving account");
	}
	HDFC(String CompanyName, String CustName, String PAN){
		System.out.println("Please wait creating current account");
	}
	/*void getInfo(int SavingAcc){
		System.out.println("Saving Account "+ CustName +" Pan no is "+PAN);
	}
	void getInfo1(int CurrentAcc){
		System.out.println("CompanyName "+ CompanyName+" Saving Account "+ CustName +" Pan no is "+PAN);
	}*/
	public static void main(String[] args){
		HDFC CustAcc1 = new HDFC("Gaurav", "a1b1");
		HDFC CustAcc2 = new HDFC("CS", "Gaurav", "ABCD1");
	}
}