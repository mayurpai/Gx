import java.util.*;

public class MatrixTranspose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Row Number : ");
		int rowNumber = sc.nextInt();
		System.out.print("Enter The Column Number : ");
		int colNumber = sc.nextInt();
		int[][] matrix = new int[rowNumber][colNumber];
		for (int i = 0; i < rowNumber; i++) {
			for (int j = 0; j < colNumber; j++) {
				System.out.print("Enter The Element [" + i + "]" + "[" + j + "] : ");
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix : ");
		for (int i = 0; i < rowNumber; i++) {
			for (int j = 0; j < colNumber; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Matrix Transpose : ");
		for (int i = 0; i < colNumber; i++) {
			for (int j = 0; j < rowNumber; j++) {
				System.out.print(matrix[j][i] + "\t");
			}
			System.out.println();
		}
	}

}
