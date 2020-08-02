
public class BreakandContinue {

	public static void main(String[] args) {
		System.out.println("The number except 5 and 8");
		for (int i = 1; i < 10; i++) {
			if (i == 5 || i == 8)
				continue;
			System.out.println(i);
		}

		System.out.println("The numbers until 6");
		for (int i = 1; i < 10; i++) {
			if (i == 6)
				break;
			System.out.println(i);
		}

	}

}
