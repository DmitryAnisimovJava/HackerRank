package bigNumber;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalChallenge {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++) {
            s[i]=sc.next();
        }
        sc.close();
        BigDecimal[] arrayOfBigDecimals = new BigDecimal[n];
        for (int i = 0; i < arrayOfBigDecimals.length; i++) {
			arrayOfBigDecimals[i] = new BigDecimal(s[i]);
		}
        boolean sorted = false;
        while (!sorted) {
        	sorted = true;
        	for(int i = 0; i < arrayOfBigDecimals.length - 1; i++) {
            	if ((arrayOfBigDecimals[i].compareTo(arrayOfBigDecimals[i+1]) == -1)) {
    				BigDecimal switcher = arrayOfBigDecimals[i];
            		arrayOfBigDecimals[i] = arrayOfBigDecimals[i+1];
            		arrayOfBigDecimals[i+1] = switcher;
            		String switcherString = s[i];
            		s[i] = s[i+1];
            		s[i+1] = switcherString;
            		sorted = false;
    			}
            }
		}
        
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
	}

}
