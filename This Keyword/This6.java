// 04/09/23
class This6{
	int CustBalance;
	String CustName;
	This6(String CustName, int CustBalance){
		System.out.println("Hii "+CustName+" Creating your account and setting the balanace ");
	}
	void getbalance(){
		System.out.println("hii "+CustName+" Your balance is "+CustBalance);
	}
	public static void main(String[] args){
		System.out.println("Start");
		This6 d1 = new This6("Gaurav", 10000);
		d1.getbalance();
		System.out.println("Stop");
	}
}