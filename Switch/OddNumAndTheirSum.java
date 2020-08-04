
public class OddNumAndTheirSum {

	public static void main(String[] args) {

		int n = 7;
		int i = 1;
		int oddsum =0;
		do {
			if (i % 2 != 0) {
				System.out.println(i);

				oddsum += i;
			}
			i++;

		} while (i <= n);
		System.out.println(oddsum);

	}

}
