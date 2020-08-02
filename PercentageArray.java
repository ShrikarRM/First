
public class PercentageArray {

	public static void main(String[] args) {
		
		int array[]={10,20,30,40};
		int tot=400;
		int sum=0;
	
		for(int i = 0; i < array.length; i++){
			
			sum+=array[i];
		}
		double percent=(sum*100)/tot;
		System.out.println(sum);
		System.out.println(percent+"%");
	}

}
