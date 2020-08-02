
public class DuplicateElment {

	public static void main(String[] args) {
		System.out.println("MMS..");
		int arr[] = {25, 14, 19, 25, 10, 14, 22};
		int j=0;
		int Tarr[] = new int[arr.length];
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]!=arr[i+1]){
				Tarr[j]=arr[i];
				j++;
				
			}
		}
		Tarr[j]=arr[arr.length-1];
		System.out.print(Tarr[j]+" ");
		
			/*for (int i=0;i<Tarr.length;i++){
				System.out.print(Tarr[j]+" ");
			}
			*/
		
		
	}

}
