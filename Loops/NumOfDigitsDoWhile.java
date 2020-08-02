import java.util.Scanner;

public class NumOfDigitsDoWhile {

	public static void main(String[] args) {
		int count = 0;
		System.out.println("enter value of n ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		do {

			n = n / 10;
			count++;

		} while (n > 0);
		System.out.println(count);

	}

}
