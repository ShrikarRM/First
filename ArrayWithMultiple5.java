import java.util.Scanner;

public class ArrayWithMultiple5 {

	public static void main(String[] args) {

		System.out.println("Start Prog");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array..");
		int n = sc.nextInt();
		System.out.println("Enter the multiplication factor");
		int m = sc.nextInt();
		
		int[] myArray = new int[n];
		int mult;
		
		System.out.println("Enterthe elements");
		//int[] numbers = { 1, 4, 6, 5 };
		

		for (int i = 0; i < n; i++) {
			myArray[i]=sc.nextInt();
			mult =myArray[i] * m;
			System.out.println( myArray[i] +"The multple of 5 of " + m+" is " +mult);
		}sc.close();

		System.out.println("End Prog");

	}

}
