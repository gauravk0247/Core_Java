class Exce{
		static void m3(){
			System.out.println("Inside m3 method");
			try{
				System.out.println(10/0);
			}
			catch(ArithmeticException ae){
				ae.printStackTrace();
			}
		}
		static void m2(){
			System.out.println("Inside m2 method");
			m3();
		}
		static void m1(){
			System.out.println("Inside m1 method");
			m2();
		}
		public static void main(String[] args){
			m1();
		}
}