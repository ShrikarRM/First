
public class InterchangeDiagonalElements {

	public static void main(String[] args) {
		int N = 4;
		int array[][] = { { 14, 15, 16, 12 }, 
				{ 1, 2, 3, 4 },
				{ 27, 84, 89, 56 }, 
				{ 34, 56, 90, 12 }
				};
		{
			
			for (int i = 0; i < N; ++i)
				if (i != N / 2) {
					int temp = array[i][i];
					array[i][i] = array[i][N - i - 1];
					array[i][N - i - 1] = temp;
				}

			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < N; ++j)
					System.out.print(array[i][j] + " ");
				System.out.println();
			}
		}

	}

}
