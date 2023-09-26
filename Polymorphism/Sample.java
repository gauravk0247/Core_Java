// constructor overloading
class Sample{
	Sample(){
		System.out.println("Inside 0 arg const");
	}
	Sample(int a){
		System.out.println("Inside 1 arg const");
	}
	public static void main(String[] args){
		new Sample(100);
	}
}

class Sample2{
	Sample2(int a){
		System.out.println("Inside 1 arg const int");
	}
	Sample2(float b){
		System.out.println("Inside 1 arg const float");
	}
	public static void main(String[] args){
		new Sample2(200.45f);
	}
}

class Sample3{
	Sample3(){
		System.out.println("Inside 0 arg const");
	}
	Sample3(int a){
		System.out.println("Inside 1 arg const");
	}
	void m1(){
		System.out.println("Inside m1 method 0 arg");
	}
	void m1(float b){
		System.out.println("Inside m1 method 1 arg");
	}
	public static void main(String[] args){
		new Sample3().m1(200.34f);
		new Sample3(100).m1();
	}
}