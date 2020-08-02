
public class HighestAndSmallestElement {

	public static void main(String[] args) {

		int[][] arr = { { 98, 214, 19 }, { 75, 5, 36 }, { 25, 45, 96 } };
		int big = arr[0][0];
		int small = arr[0][0];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] > big)
					arr[i][j] = big;

				if (arr[i][j] < small) {
					small = arr[i][j];
				}
			}
		}

		System.out.println("smallest number is: " + small + "\n & Biggest number is: " + big);

	}

}
