import java.util.Scanner;

public class CubeOfNumber {

	public static void main(String[] args) {

		System.out.println("enter value of n ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		for (int i = 1; i <= n; i++) {

			int cube = i * i * i;
			System.out.println("Cube of entered num i is " + cube);
		}
	}

}
