import java.util.Scanner;
public class MultipleofNum {

	public static void main(String[] args) {
		System.out.println("Enter an integer to find the multiples");
		Scanner scan= new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		
		for(int i=1;i<=10;i++){
			int mult =i*input;
			System.out.println(input +"*"+i+"="+mult);
		}
	}

}
