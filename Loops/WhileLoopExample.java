
public class WhileLoopExample {

	public static void main(String[] args) {
		int endval = 10;
		int i = 1;
		System.out.println("print num between 1 to 10");
		while (i <= endval) {
			System.out.println(i);
			i++;

		}
		int j = endval;
		System.out.println("print num between 10 to 1 in reverse");
		while (j > 0) {
			System.out.println(j);
			j--;

		}
	}

}
