package dataStrcutures;

import java.util.Arrays;
import java.util.Scanner;

public class JavaSubarrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] inputArray = new int[n];
		int arrayIndex = 0;
		while (n > 0) {
			inputArray[arrayIndex] = sc.nextInt();
			arrayIndex++;
			n--;
		}
		sc.close();
		int result = 0;
		for (int i = 0; inputArray.length - i > 0; i++) {
			for (int j = 0; j <= inputArray.length - i; j++) {
				int[] row = Arrays.copyOfRange(inputArray, i, i + j);
				int sum = 0;
				for (int k = 0; k < row.length; k++) {
					sum = sum + row[k];
				}
				if (sum < 0) {
					result++;
				}
			} 
		}
		System.out.println(result);
	}

}
