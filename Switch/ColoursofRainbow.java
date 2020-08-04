
public class ColoursofRainbow {

	public static void main(String[] args) {

		System.out.println("Start prog");
		String color = "Pink";
		String result = null;

		System.out.println("The input color is " + color);

		switch (color) {
		case "Blue":
			result = null;
			break;

		case "Indigo":
			result = "The entered colour is related to rainbow";
			break;

		case "Red":
			result = "The entered colour is related to rainbow";
			break;

		case "green":
			result = "The entered colour is related to rainbow";
			break;

		case "yellow":
			result = "The entered colour is related to rainbow";
			break;

		case "Orange":
			result = "The entered colour is related to rainbow";
			break;

		case "Violet":
			result = "The entered colour is related to rainbow";
			break;

		default:
			result = "The entered colour is not related to rainbow";
			break;
		}
		System.out.println("The color of rainbow: "+result);
		System.out.println("End prog");

	}

}
