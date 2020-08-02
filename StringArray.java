
public class StringArray {

	public static void main(String[] args) {
		System.out.println("Start prog");

		String[] strArray = new String[5];

		strArray[0] = "Car";
		strArray[1] = "Bike";
		strArray[2] = "Truck";

		System.out.println("The value of strarray are using for loop");

		int len = strArray.length; // size
		for (int i = 0; i < len; i++) {
			if(strArray[i]!= null){
				System.out.println(strArray[i]);
		}
		}
		String[] literalStr = { "summer", "rainy", "winter" };

		System.out.println("the length of literal String :" + literalStr.length);
		System.out.println(literalStr); // address of literalStr array
		System.out.println();

		System.out.println("the value of literalStr using for each loop");
		for (String tempStr : literalStr) {
			System.out.println(tempStr);
		}

		// for(String tempStr)

		System.out.println("End prog");

	}

}
