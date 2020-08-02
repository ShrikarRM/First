
public class SumOfInt {
	public static void main(String[] args) {
		System.out.println("Sum of integers between 5 - 25 is ");
		int sum = 0;

		for (int i = 5; i <= 25; i++) {

			sum = i + sum;
		}
		System.out.println(sum); // "\t" for tab
	}

}
