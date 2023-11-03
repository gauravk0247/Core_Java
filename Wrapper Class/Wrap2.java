// 03/11/2023
class Wrap2{
	public static void main(String[] args){
		// Exception in thread "main" java.lang.NumberFormatException: For input string: "Hundred"
		Integer i11 = new Integer("Hundred");
		System.out.println(i11);
	}
}