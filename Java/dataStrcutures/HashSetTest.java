package dataStrcutures;

import static java.lang.Math.rint;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        int result = 0;
        Set<String> mySet = new HashSet<>();
        for (int i = 0; i < pair_right.length; i++) {
			if (!mySet.contains(pair_left[i]+ " "+pair_right[i])) {
				mySet.add(pair_left[i]+ " "+pair_right[i]);
				result++;
			}
			System.out.println(result);
		}
   }
}