
public class StringExample {

	public static void main(String[] args) {

		// sequence of characters...also a type of non-primitive data type

		String name = "Shrikar"; // string literals
		String msg = new String("Welcome"); // using new keyword

		System.out.println("the Name is  " + name);
		System.out.println("the msg is  " + msg);
		
		int namelength = name.length();
		System.out.println("length of name " + namelength);

		String capsName = name.toUpperCase();
		System.out.println("Name in capital letters " + capsName);

		String smallName = name.toLowerCase();
		System.out.println("Name in small letters " + smallName);

	}

}
