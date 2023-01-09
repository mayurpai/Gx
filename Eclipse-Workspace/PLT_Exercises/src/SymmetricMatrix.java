import java.util.Scanner;

public class SymmetricMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The NxN Number : ");
		int N = sc.nextInt();
		int[][] matrix = new int[N][N];
		boolean flag = true;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("Enter The Element [" + i + "]" + "[" + j + "] : ");
				matrix[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (matrix[i][j] != matrix[j][i])
					flag = false;
			}
		}
		if (flag)
			System.out.println("It Is A Symmetric Matrix");
		else
			System.out.println("It Is Not A Symmetric Matrix");

	}

}
