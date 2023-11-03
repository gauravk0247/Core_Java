// 03/11/2023
// Q. How will you convert wrapper object to primitive data.
class Wrap7{
	public static void main(String[] args){
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(200);
		int i11=i1.intValue();
		int i12=i2.intValue();
		System.out.println(i11+i12);
	}
}

// xxxxxValue;
// public int intValue();

class Wrap8{
	public static void main(String[] args){
		Float f1 = new Float(200.56f);
		Float f2 = new Float(300.30d);
		Float f11 = f1.floatValue();
		Float f22 = f2.floatValue();
		System.out.println(f11+f22);
	}
}

class Wrap9{
	public static void main(String[] args){
		Character c1 = new Character('V');
		Character c2 = new Character('G');
		Character c11 = c1.charValue();
		Character c22 = c2.charValue();
		System.out.println(c11+c22);
	}
}