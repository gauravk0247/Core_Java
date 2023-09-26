// 05/09/23
class Sample{
	{
		System.out.println("Inside non-Static or instance block");
	}
	public static void main(String[] args){
		System.out.println("Start");
		Sample g1 = new Sample();
		System.out.println("Stop");
	}
}