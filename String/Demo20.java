import java.util.StringTokenizer;
class Demo20{
	public static void main(String[] args){
		StringTokenizer st1 = new StringTokenizer("This is an example of String Tokenizer");
		while(st1.hasMoreElements()){
			System.out.println(st1.nextElement());
		}
	}
}

class Demo21{
	public static void main(String[] args){
		StringTokenizer st1 = new StringTokenizer("This is an ,example of ,string Tokenizer",",");
		while(st1.hasMoreElements()){
			System.out.println(st1.nextElement());
		}
	}
}