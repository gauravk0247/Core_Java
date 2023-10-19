// 18/20/23
class Demo16{
	public static void main(String[] args){
		String str1 = "This is an example of split method";
		String[] ss=str1.split(" ");
		for(int i=0;i<ss.length;i++){
			System.out.println(ss[i]);
		}
	}
}
class Demo17{
	public static void main(String[] args){
		String str1 = "This is an ,example of ,split method";
		String[] ss=str1.split(",");
		for(int i=0;i<ss.length;i++){
			System.out.println(ss[i]);
		}
	}
}