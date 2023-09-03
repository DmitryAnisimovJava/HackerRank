package strings;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String result = "";
		if (A.length() % 2 == 0) {
			for (int i = 0; i < A.length() / 2; i++) {
				if (A.charAt(i) == A.charAt(A.length() - i - 1)) {
					result = "Yes";
				} else {
					result = "No";
					break;
				}
			}
		} else {
			for (int i = 0; i < (A.length() - 1) / 2; i++) {
				if (A.charAt(i) == A.charAt(A.length() - i - 1)) {
					result = "Yes";
				} else {
					result = "No";
					break;
				}
			}
			if (A.length() == 1) {
				result = "Yes";
			}
		}
		System.out.println(result);
	}
}