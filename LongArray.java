
public class LongArray {

	public static void main(String[] args) {
		System.out.println("Start prog");

		long[] longArray = new long[5];

		longArray[0] = 98564L;
		longArray[1] = 343454L;
		longArray[2] = 3439484L;

		System.out.println("The value of longarray are using for loop");

		int len = longArray.length; // size
		for (int i = 0; i < len; i++) {
			if (longArray[i] != 0l) {
				System.out.println(longArray[i]);

			}
		}

		System.out.println("the value of longArray using for each loop");
		for (Long l : longArray) {
			System.out.println(l);
		}
		System.out.println("End prog");
	}

}
