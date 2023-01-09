import java.util.Scanner;

public class MatrixOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matrixA;
		int[][] matrixB;
		int rowNumber;
		int colNumber;
		System.out.println("Matrix A : ");
		System.out.print("Enter The Row Number  : ");
		rowNumber = sc.nextInt();
		System.out.print("Enter The Column Number : ");
		colNumber = sc.nextInt();
		matrixA = new int[rowNumber][colNumber];
		for (int i = 0; i < rowNumber; i++) {
			for (int j = 0; j < colNumber; j++) {
				System.out.print("Enter The Element [" + i + "]" + "[" + j + "] : ");
				matrixA[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("Matrix B : ");
		System.out.print("Enter The Row Number  : ");
		rowNumber = sc.nextInt();
		System.out.print("Enter The Column Number : ");
		colNumber = sc.nextInt();
		matrixB = new int[rowNumber][colNumber];
		for (int i = 0; i < rowNumber; i++) {
			for (int j = 0; j < colNumber; j++) {
				System.out.print("Enter The Element [" + i + "]" + "[" + j + "] : ");
				matrixB[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		if ((matrixA.length == matrixB.length) && (matrixA[0].length == matrixB[0].length)) {
			matrixAddition(matrixA, matrixB);
			System.out.println();
			matrixSubtract(matrixA, matrixB);
			System.out.println();
		} else {
			System.out.println("Unknown Constraints For Addition & Subtraction");
		}
		if (matrixA[0].length == matrixB.length) {
			matrixMultiplication(matrixA, matrixB);
			System.out.println();
		} else {
			System.out.println("Unknown Constraints");
		}
	}

	public static void matrixAddition(int[][] matrixA, int[][] matrixB) {
		System.out.println("Matrix Addition : ");
		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixA[0].length; j++) {
				System.out.print((matrixA[i][j] + matrixB[i][j]) + "\t");
			}
			System.out.println();
		}
	}

	public static void matrixSubtract(int[][] matrixA, int[][] matrixB) {
		System.out.println("Matrix Subtraction: ");
		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixA[0].length; j++) {
				System.out.print((matrixA[i][j] - matrixB[i][j]) + "\t");
			}
			System.out.println();
		}
	}

	public static void matrixMultiplication(int[][] matrixA, int[][] matrixB) {
		System.out.println("Matrix Multiplication : ");
		int[][] matrixSol = new int[matrixA.length][matrixB[0].length];
		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixB[0].length; j++) {
				for (int k = 0; k < matrixB.length; k++) {
					matrixSol[i][j] += matrixA[i][k] * matrixB[k][j];
				}
			}
		}
		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixB[0].length; j++) {
				System.out.print(matrixSol[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
