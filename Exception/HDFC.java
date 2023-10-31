// 31/10/23
class HDFC{
	float bal;
	HDFC(float bal){
		this.bal=bal;
	}
	void transferAmount(float amount){
		System.out.println("Transfering Amount");
		if(amount<=bal){
			System.out.println("Amount is treansfer successful");
			bal=bal-amount;
			System.out.println("The balance amount is "+bal);
		}
		else{
			System.out.println("Inside else");
			throw new ArithmeticException("Amount entered is invalid, please enter valid amount");
		}
	}
	public static void main(String[] args){
		HDFC acc1 = new HDFC(5000);
		acc1.transferAmount(12500);
	}
}