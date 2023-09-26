//01/09/23
class Hard{
	Work refvar;
}
class Work{
	Journey refvar2;
	void m1(){
		System.out.println("inside m1 method");
		Journey p1 = new Journey();
		float result = p1.m2();
		System.out.println(result);
	}
}
class Journey{
	float m2(){
		int a = 100;
		float b = 200.5f;
		float result = a+b;
		return result;
	}
}
class Success{
	public static void main(String[] args){
		System.out.println("Start");
		Hard s1 = new Hard();
		s1.refvar = new Work();
		s1.refvar.m1();
		//Journey s2 = new Journey();
		//s2.m2();
		Work s2 = new Work();
		s2.refvar2 = new Work();
		s2.refvar2.m2();
		System.out.println("Stop");
	}
}