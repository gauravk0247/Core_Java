// 27/09/23
class RBI{
	void activation(){
		System.out.println("Activation charges are 1%");
	}
	void loans(){
		System.out.println("RBI ROI Applicable to citizen should be 8%");
	}
}
class ICICI extends RBI{
	void loans(){
		System.out.println("ICICI ROI Applicable to citizen should be 15%");
	}
}
class HDFC extends RBI{
	void loans(){
		System.out.println("HDFC ROI Applicable to citizen should be 14.5%");
	}
}
class YES extends RBI{
	//void loans(){
		//System.out.println("YES ROI Applicable to citizen should be 13%");
	//}
}
class Cust{
	public static void main(String[] args){
		RBI p = new ICICI();
		p.loans();
		p.activation();
		RBI p2 = new YES();
		p2.loans();
		p2.activation();
	}
}