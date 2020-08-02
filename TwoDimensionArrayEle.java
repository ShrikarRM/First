import java.util.Scanner;

public class TwoDimensionArrayEle {

	public static void main(String[] args) {

		System.out.println("Main Method Started..");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows and columns");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] twoArr = new int[r][c];
		System.out.println("Address " + twoArr);

		System.out.println("Enter array elements..");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				twoArr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		System.out.println("Array elements are..");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(twoArr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print("Main Method Ended..");

	}

}
