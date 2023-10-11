// 10/10/23
interface it1{
	int a = 100;
}
interface it2{
	int a = 200;
}
class Bego implements it1, it2{
	public static void main(String[] args){
		System.out.println(it1.a);
		System.out.println(it2.a);
	}
}