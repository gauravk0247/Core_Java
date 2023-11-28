// 27/11/23
class Arrays14{
	public static void main(String[] args){
		int[][] a = {{10, 20, 30},
					 {40, 50, 60},
					 {70, 80, 90}};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<=2;j++){
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}
}