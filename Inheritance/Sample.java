// 12/09/23
class Sample4{
	void g1(){
		System.out.println("Inside g1 method");
	}
}
class Sample3 extends Sample4{
	void g2(){
		System.out.println("Inside g2 method");
	}
}
class Sample2 extends Sample4{
	void g3(){
		System.out.println("Inside g3 method");
	}
}
class Sample0 extends Sample4{
	void g4(){
		System.out.println("Inside g4 method");
	}
}
class Sample{
	public static void main(String[] args){
		System.out.println("Start");
		Sample4 s1 = new Sample4();
		s1.g1();
		System.out.println("---------------------");
		Sample3 s2 = new Sample3();
		s2.g1();
		s2.g2();
		System.out.println("----------------------");
		Sample2 s3 = new Sample2();
		s3.g1();
		s3.g3();
		System.out.println("----------------------");
		Sample0 s4 = new Sample0();
		s4.g1();
		s4.g4();
		System.out.println("Stop");
	}
}