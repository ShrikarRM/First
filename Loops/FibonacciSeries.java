import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		System.out.println("Enter value of n");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.close();
		int a = 0, b = 1;
		// System.out.println(a);
		// System.out.println(b);
		int i = 1;
		while (i <= n) {
			System.out.println(a);
			int c = a + b;
			a = b;
			b = c;
			i++;
		}

	}

}
