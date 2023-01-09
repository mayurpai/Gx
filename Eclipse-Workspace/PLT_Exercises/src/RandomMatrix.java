public class RandomMatrix {

	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		matrix[0][0] = 4;
		matrix[0][1] = 4;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == 0 && (j == 0 || j == 1))
					continue;
				matrix[i][j] = (int) (Math.random() * 100000);
			}
		}
		for (int m = 0; m < matrix.length; m++) {
			for (int n = 0; n < matrix[0].length; n++) {
				System.out.print(matrix[m][n] + "\t");
			}
			System.out.println();
		}

	}

}
