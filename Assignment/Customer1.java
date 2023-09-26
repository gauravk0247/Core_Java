// 08/09/23
// Business Class
class Swiggy{
	int MobNum;
	String custName, Address;
	static{
		System.out.println("connect to Swiggy server");
	}
	{
		System.out.println("After verification generate an otp");
	}
	Swiggy(int MobNum){
		System.out.println("Hii "+ custName +" creating your account and redy for order");
		this.MobNum=MobNum;
	}
	void getOrder(){
		System.out.println("Hii "+custName+" Search Food "+" Place the order of address "+Address+" Contact with this number "+MobNum);
	}
	void placeOrder(){
		System.out.println("Your order has been successfully placed!!");
	}
	void setProfile()
	{
		System.out.println("Your profile is ready for ");
	}
}
class Customer1{
	public static void main(String[] args){
		System.out.println("Start");
		Swiggy g1 = new Swiggy(12345);
		g1.getOrder();
		g1.placeOrder();
		System.out.println("Stop");
	}
}