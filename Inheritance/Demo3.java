// 12/09/23 
// Hierarchical Inheritance
class G{
	int a = 67;
}
class P extends G{
	float b = 34.56f;
}
class K extends G{
	char c = 'x';
}
class V extends G{
	boolean d = true;
}
class Demo3{
	public static void main(String[] args){
		System.out.println("Start");
		G g1 = new G();
		System.out.println(g1.a);
		System.out.println("---------------");
		P p1 = new P();
		System.out.println(p1.a);
		System.out.println(p1.b);
		System.out.println("----------------");
		K k1 = new K();
		System.out.println(k1.a);
		System.out.println(k1.c);
		System.out.println("--------------------");
		V v1 = new V();
		System.out.println(v1.a);
		System.out.println(v1.d);
		System.out.println("Stop");
	}
}