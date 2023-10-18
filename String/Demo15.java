// 18/10/23
class Demo15{
	public static void main(String[] args){
		int[] a = {10, 20, 30};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("---------------------");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}

class Demo16{
	public static void main(String[] args){
		String[] str1={"abc","def","ghi"};
		System.out.println(str1[0]);
		System.out.println(str1[1]);
		System.out.println(str1[2]);
		//System.out.println(str1[3]); // ArrayIndexOutOfBoundsException
		
		System.out.println("----------------");
		for(int i=0;i<str1.length;i++){
			System.out.println(str1[i]);
		}
	}
}