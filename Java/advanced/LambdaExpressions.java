package advanced;

import java.io.*;
import java.util.*;

interface PerformOperation {
	
	boolean check(int a);
 	
}

class MyMath {
	
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}
	
	public PerformOperation isOdd() {
		PerformOperation isOddPerformOperation = x -> {
			boolean odd = x % 2 != 0 ? true : false;
			return odd;
		};
		return isOddPerformOperation;
	}
	
	public PerformOperation isPrime() {
		PerformOperation isPrimeOperation = x -> {
			for (int i = 1; i < x; i++) {
				if (x % i == 0 & i != 1) {
					return false;
				}
			}
			return true;
		};
		return isPrimeOperation;
	}
	
	public PerformOperation isPalindrome() {
		PerformOperation isPalindromeOperation = x -> {
			String xString = String.valueOf(x);
			StringBuffer reverseString = new StringBuffer(xString).reverse(); 
			if (xString.equals(reverseString.toString())) {
				return true;
			}
			return false;
		};
		return isPalindromeOperation;
	}
}

public class LambdaExpressions {

	public static void main(String[] args) {
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		while (T--> 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = ob.isOdd();
				ret = ob.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				op = ob.isPrime();
				ret = ob.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = ob.isPalindrome();
				ret = ob.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
		   }
			System.out.println(ans);
		  }
	}
}
