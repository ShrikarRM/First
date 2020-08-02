import java.util.Scanner;
           
public class LowerTriangularMatrix {

	public static void main(String[] args) {

		System.out.println("Enter row and column values..");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] twoArr = new int[r][c];
		if (r != c) {
			System.out.println("Enter same order for rows & columns");
		} else {
			System.out.println("Enter array values..");
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					twoArr[i][j] = sc.nextInt();
				}
			}
			sc.close();
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					if (i > j) {
						System.out.print(" " + " ");
					} else
						System.out.print(twoArr[i][j] + " ");
				}
				System.out.println();
			}

		}
	}
}
