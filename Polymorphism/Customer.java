// server
class Flipkart{
	void payment(){
		System.out.println("pay by cash");
	}
	void payment(int debitNum){
		System.out.println("Pay bt debir card");
	}
	void payment(String upi){
		System.out.println("pay by upi");
	}
	void payment(float wallet){
		System.out.println("pay by onilne wallet");
	}
}
class Customer{
	public static void main(String[] args){
		System.out.println("Customer wants to buy an item from flipkart.com");
		Flipkart custAcc = new Flipkart();
		custAcc.payment(12345);
	}
}