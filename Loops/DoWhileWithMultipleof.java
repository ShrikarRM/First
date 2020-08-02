
public class DoWhileWithMultipleof {

	public static void main(String[] args) {
		System.out.println("Num in reverse order");
		int i=10;
		//int prod;
		int num=1;
		
		do{
			int prod =i*num;
			System.out.println(i+"*"+num+"="+prod);
			num++;
		}while(num<=10);
	}

}
