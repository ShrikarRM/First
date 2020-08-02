import java.util.Scanner;

public class FactorialOfNum {

	public static void main(String[] args) {
		System.out.println("enter value of n ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		int fact = 1;
		int i = 1;
		while (i <= n) {
			fact = fact * i;
			i++;
		}
		System.out.println("Factorial of given num " + n + "=" + fact);
	}

}
