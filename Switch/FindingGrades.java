
public class FindingGrades {

	public static void main(String[] args) {
		char grade = 'B';
		String result = null;  //starting without initialization

		System.out.println("The iput grade is :" + grade);

		switch (grade) {
		case 'A':
			result = "between 85 to 100";
			break;

		case 'B':
			result = "between 65 to 84";
			break;

		case 'C':
			result = "between 35 to 64";
			break;

		default:
			result = "You did not pass";
			break;
		}
		System.out.println("Your marks is :" + result);
	}

}
