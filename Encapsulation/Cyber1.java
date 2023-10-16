// 14/10/23
// Marker Interface
// Pending
class Tech implements Cloneable{
	int a = 100;
	float b = 20.34f;
	protected object clone(){
		object ref;
		try{
			ref=super.clone();
		}
		catch(CloneNotSupportedException)
		{
			ref=this;
		}
		return ref;
	}
}
class Cyber1{
	public static void main(String[] args){
		Tech t1 = new Tech();
		System.out.println(t1);
		Tech t2 = (Tech)t1.Clone();
		System.out.println(t2);
	}
}