package dataStrcutures;

import java.util.Scanner;

public class Array1D {

	public static void main(String[] args) {
		   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int j = 0;
        while (n > 0) {
			int val = scan.nextInt();
			a[j] = val;
			n--;
			j++;
        }
        scan.close();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
