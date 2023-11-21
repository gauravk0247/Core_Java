// 21/11/23
class HDFC{
	void banking(){
		class Banking{
			float amountBalance = 1000.5f;
		}
		Banking b1 = new Banking();
		System.out.println(b1.amountBalance);
	}
	void insurance(){
		class Insurance{
			int insureId = 12345;
		}
		Insurance i1 = new Insurance();
		System.out.println(i1.insureId);
	}
}
class Customer{
	public static void main(String[] args){
		HDFC cust1 = new HDFC();
		cust1.banking();
		cust1.insurance();
	}
}