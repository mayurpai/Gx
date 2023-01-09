import java.util.Scanner;

public class IdentityMatrix {

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
				if (i == j && matrix[i][j] != 1)
					flag = false;
				else if (i != j && matrix[i][j] != 0)
					flag = false;
				else
					flag = true;
			}
		}
		if (flag)
			System.out.println("It Is An Identity Matrix");
		else
			System.out.println("It Is Not An Identity Matrix");

	}

}
