
public class CharArray {

	public static void main(String[] args) {
		char[] charArr = new char[4];

		charArr[0] = 'A';
		charArr[1] = 'E';
		charArr[2] = 'I';

		System.out.println("The value of array are :");
		int len = charArr.length; // size
		for (int i = 0; i < len; i++) {
			
				System.out.println(charArr[i]);
		
		}
		int leng = charArr.length; // size
		for (int i = 0; i < leng; i++) {
			if (charArr[i] != '\u0000') {
				System.out.println(charArr[i]);

			}
		}

	}

}
