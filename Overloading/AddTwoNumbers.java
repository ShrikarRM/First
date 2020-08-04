
public class AddTwoNumbers {

	int a;
	int b;
	int c;
	
	AddTwoNumbers(){
		
	
	}
	
	public AddTwoNumbers(int inputa,int inputb, int inputc){
		a=inputa;
		b=inputb;
		c=inputc;
		
	}
	

	void sum(int a, int b,int c){  //M overloading
		int sum =a +b+c ;
		System.out.println("Sum of 3 num :"+sum);
	}
	
	void sum(double a, double b,double c){  //M overloading
		double sum =a +b+c ;
		System.out.println("Sum of 3 num :"+sum);
	}
	
	void sum(int a, double b){  //method signature
		double sum =a +b;
		System.out.println("Sum of two num :"+sum);
	}
	
	
	public static void main(String[] args) {
		AddTwoNumbers add= new AddTwoNumbers(10,20,30);
	System.out.println("a :"+add.a+" b :"+add.b);
	add.sum(add.a,add.b);
	
	add.sum(10, 20);
	add.sum(10, 20,30);
	}

}
