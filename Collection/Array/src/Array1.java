import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
	void Dispaly (int mat[][]) {
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat.length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size  of row and col");
		int size=sc.nextInt();
		
		int mat[][] =new int[size][size];
		
		System.out.println("Enter the values in matrix: ");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		
		
		Array1 obj = new  Array1();
		obj.Dispaly(mat);
		
	}
}
