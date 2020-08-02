
public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		
		System.out.println("Start Prog");
		
		
		int intArray[][];
		intArray = new int[2][2];
		intArray[0][0]=1;
		intArray[0][1]=2;
		intArray[1][0]=3;
		intArray[1][1]=4;
		
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++	){
				System.out.print("["+i+"]["+j+"] : ");
				System.out.println(intArray[i][j]);
			}
		}
		System.out.println("using literals");
		int[][] literalArray ={
				{10,20}
				,{30,40}
		};
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++	){
				System.out.print("["+i+"]["+j+"] : ");
				System.out.println(literalArray[i][j]);
			}
		}
		System.out.println("====3*3===");
		int[][] threeArray ={
				{10,20,50}
				,{30,40,60},
				{70,80,90}
		};
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++	){
				System.out.print("["+i+"]["+j+"] : ");
				System.out.println(threeArray[i][j]+"\t");
			}
		}
		
		
		System.out.println("End Prog");
	}

}
