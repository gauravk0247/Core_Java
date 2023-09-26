// 12/09/23
// parent
//  cannot inherit from final SampleThree
// class SampleTwo extends SampleThree{
// Parent
final class SampleThree{
	int a = 100;
}
// Child
class SampleTwo extends SampleThree{
	void m1(){
		System.out.println("Inside m1 method "+a);
	}
}
class SampleOne{
	public static void main(String[] args){
		System.out.println("Start");
		SampleTwo t1 = new SampleTwo();
		t1.m1();
		System.out.println("Stop");
	}
}