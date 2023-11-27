// 27/11/23
class Arrays3{
	public static void main(String[] args){
		// When it integer an array and we not initialize any value then bydefault compiler add the value 0
		int[] x = new int[3];
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}
		// When it float an array and we not initialize any value then bydefault compiler add the value 0.0
		float[] f = new float[3];
		for(int i=0;i<f.length;i++){
			System.out.println(f[i]);
		}
		// When it char an array and we not initialize any value then bydefault compiler add blank space
		char[] c = new char[3];
		for(int i=0;i<c.length;i++){
			System.out.println(c[i]);
		} 
	}
}