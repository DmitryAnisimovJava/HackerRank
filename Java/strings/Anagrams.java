package strings;

import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
	
	static boolean isAnagram(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		char[] arrayForStringA = a.toCharArray(); 
		char[] arrayForStringB = b.toCharArray(); 
		java.util.Arrays.sort(arrayForStringA);
		java.util.Arrays.sort(arrayForStringB);
		return java.util.Arrays.equals(arrayForStringA, arrayForStringB);
	}

}
