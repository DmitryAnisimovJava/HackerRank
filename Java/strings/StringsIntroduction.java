package strings;

import java.util.Scanner;

public class StringsIntroduction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		int sum = A.length() + B.length();
		System.out.println(sum);
		int compareResult = A.compareTo(B);
		if (compareResult > 0) {
			System.out.println("Yes");
		} else if (compareResult < 0) {
			System.out.println("No");
		}
		A = A.substring(0, 1).toUpperCase() + A.substring(1, A.length());
		B = B.substring(0, 1).toUpperCase() + B.substring(1, B.length());
		System.out.println(A + " " + B);
	}

}
