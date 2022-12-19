package mathematicalTorFofString;

public class ValidateStringisMT {
	public static void main(String[] args) {
		String text = "10";
		System.out.println(" string: " + text);
		System.out.println("Check if the said string is a mathematical expression or not: " + validate(text));
		text = "10 + 20";
		System.out.println(" string: " + text);
		System.out.println("Check if the said string is a mathematical expression or not: " + validate(text));
		
		System.out.println(" string: " + text);
		System.out.println("Check if the said string is a mathematical expression or not: " + validate(text));
		text = "100 +";
		System.out.println("\n string: " + text);
		System.out.println("Check if the said string is a mathematical expression or not: " + validate(text));
		text = "100 + foo";
		System.out.println(" string: " + text);
		System.out.println("Check if the said string is a mathematical expression or not: " + validate(text));
		text = " 10 *+ 20 * 30 ";
		System.out.println(" string: " + text);
		System.out.println("Check if the said string is a mathematical expression or not: " + validate(text));
	}

	public static boolean validate(String text) {
		return text.matches("((?:(?:^|[-+_*/])(?:\\s*-?\\d+(\\.\\d+)?(?:[eE][+-]?\\d+)?\\s*))+$)");
	}
}