// 27/11/23
class Arrays6{
	public static void main(String[] args){
		// When it String an array and we not initialize any value then bydefault compiler add the value null
		String[] s1 = new String[3];
		for(int i=0;i<s1.length;i++){
			System.out.println(s1[i]);
		}
		// When it UserDefined an array and we not initialize any value then bydefault compiler add the value null
		Emp[] e = new Emp[3];
		for(int i=0;i<e.length;i++){
			System.out.println(e[i]);
		}
	}
}