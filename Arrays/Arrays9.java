// 27/11/23
class Arrays9{
	public static void main(String[] args){
		Emp e1 = new Emp(101, "Ram");
		Emp e2 = new Emp(202, "Sham");
		Emp e3 = new Emp(303, "Naru");
		Emp[] e = new Emp[3];
		e[0]=e1;
		e[1]=e2;
		e[2]=e3;
		for(Emp ee:e){
			System.out.println(ee);
		}
	}
}