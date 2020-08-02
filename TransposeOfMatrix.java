
public class TransposeOfMatrix {
	public static void main(String args[]) {

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int transArr[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				transArr[i][j] = arr[j][i];
			}
		}

		System.out.println("Initial matrix elements:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Transposed matrix elements :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(transArr[i][j] + " ");
			}
			System.out.println();
		}
	}
}