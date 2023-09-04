package strings;

import java.util.Scanner;

public class Tokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if (s.isBlank()) {
			System.out.println("0");
		} else {
			String[] result = s.trim().split("[!,?._'@\\s]+");
	        scan.close();
	        System.out.println(result.length);
	        for (int i = 0; i < result.length; i++) {
				System.out.println(result[i]);
	        }
		}
	}
}
