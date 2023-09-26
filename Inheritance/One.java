// when we use final bafore child class they work
// Parent class
class Three{
	int a = 300;
}
final class Two extends Three{
	void m1(){
		System.out.println("Inside m1 method "+a);
	}
}
// Child class
class One{
	public static void main(String[] args){
		System.out.println("Start");
		Two t1 = new Two();
		t1.m1();
		System.out.println("Stop");
	}
}