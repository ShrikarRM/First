
public class EvenOddEle {

	public static void main(String[] args) {
		int array[] = { 25, 14, 19, 87, 10, 36, 22 };

		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0)
				count++;
		}
		int[] array1 = new int[count];

		int[] array2 = new int[array.length - count];
		int x = 0, y = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				array1[x++] = array[i];
			} else {
				array2[y++] = array[i];
			}
		}

		System.out.println("Print evenarray elements..");

		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();

		System.out.println("odd elements are ");

		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
	}
}
