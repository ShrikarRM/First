import java.util.Scanner;
public class MultipleOf5 {

	public static void main(String[] args) {
System.out.print("enter");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		
		int i=1 ;
		//int endval;
		while(num<=10){
			int mult =i*num;
			System.out.println(i +"*"+num+"="+mult);
			i++;
		}
	}

}
