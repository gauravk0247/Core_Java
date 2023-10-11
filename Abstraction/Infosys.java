// 10/10/23
interface HDFC_Services{
	void banking();
	void finance();
	void insurance();
}
class Implementations implements HDFC_Services{
	public void banking(){}
	public void finance(){}
	public void insurance(){} 
}
class HDFC_Banking extends Implementations{
	public void banking(){
		System.out.println("Inside banking");
	}
}
class Infosys extends HDFC_Banking{
	public static void main(String[] args){
		HDFC_Banking hb = new HDFC_Banking();
		hb.banking();
		System.out.println("-------------------");
		Infosys i1 = new Infosys();
		i1.banking();
		System.out.println("--------------------");
		HDFC_Banking h2 = new Infosys();
		h2.banking();
	}
}