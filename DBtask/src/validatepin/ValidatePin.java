package validatepin;

import java.util.Scanner;
import java.util.regex.*;

public class ValidatePin {

	public static boolean isvalidpin(String pin) {

		String regex = "^[1-9]{1}[0-9]{2}[0-9]{3}|[0-9]{4}|[2-9]{3}[0-9]{5}$";
		Pattern p = Pattern.compile(regex);

		if (pin == null) {
			return false;
		}

		Matcher m = p.matcher(pin);
		return m.matches();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a pattern: ");

		String num1 = sc.nextLine();
		System.out.println(num1 + ": " + isvalidpin(num1));
	}

}
