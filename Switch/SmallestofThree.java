
public class SmallestofThree {

	public static void main(String[] args) {
		int a = 20, b = 8, c = 10;

		int result;
		result = a < b ? (a < c ? a : c) : (b < c ? b : c);
		System.out.println("Samllest of given integers " + result);
	}

}
