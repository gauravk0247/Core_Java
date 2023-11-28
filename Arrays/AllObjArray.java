// 28/11/23
class AllObjArray{
	public static void main(String[] args){
		Integer i = 100;
		Float f = 200.5f;
		Character c = 'x';
		Emp e = new Emp(100, "Gaurav", 20000.5f);
		Object[] o = new Object[4];
		o[0]=i;
		o[1]=f;
		o[2]=c;
		o[3]=e;
		for(Object oo:o){
			if(oo instanceof Integer){
				Integer ii = (Integer)oo;
				System.out.println(ii);
			}
			else if(oo instanceof Float){
				Float ff = (Float)oo;
				System.out.println(ff);
			}
			else if(oo instanceof Character){
				Character cc = (Character)oo;
				System.out.println(cc);
			}
			else if(oo instanceof Emp){
				Emp ee=(Emp)oo;
				System.out.println(ee.empId+" - "+ee.empName+" - "+ee.empSal);
			}
		}
	}
}