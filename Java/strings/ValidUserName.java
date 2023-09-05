package strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidUserName {
	 private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
	}
}

class UsernameValidator {
	
	static String regularExpression = UsernameValidator.getRegularExpression();

	static private String getRegularExpression() {
		Pattern pattern = Pattern.compile("\\b[a-zA-Z]\\w{7,29}");
		return pattern.pattern();
	}
	
}
