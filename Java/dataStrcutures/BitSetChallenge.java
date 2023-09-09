package dataStrcutures;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Scanner;

public class BitSetChallenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		BitSet B1 = new BitSet(N);
		BitSet B2 = new BitSet(N);
		ArrayList<ArrayList<BitSet>> reslutList = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			ArrayList<BitSet> subList = new ArrayList<>();
			String[] lineFromConsole = sc.nextLine().trim().split("\\s");
			if (lineFromConsole.length == 1) {
				lineFromConsole = sc.nextLine().trim().split("\\s");
			}
			String operation = lineFromConsole[0];
			int firstInput = Integer.parseInt(lineFromConsole[1]);
			int secondInput = Integer.parseInt(lineFromConsole[2]);
			if (operation.equals("AND")) {
				if (firstInput == 1) {
					B1.and(B2);
				} else {
					B2.and(B1);
				}
			} 
			if (operation.equals("OR")) {
				if (firstInput == 1) {
					B1.or(B2);
				} else {
					B2.or(B1);
				}
			} 
			if (operation.equals("XOR")) {
				if (firstInput == 1) {
					B1.xor(B2);
				} else {
					B2.xor(B1);
				}
			} 
			if (operation.equals("FLIP")) {
				if (firstInput == 1) {
					B1.flip(secondInput);
				} else {
					B2.flip(secondInput);
				}
			}
			if (operation.equals("SET")) {
				if (firstInput == 1) {
					B1.set(secondInput);
				} else {
					B2.set(secondInput);
				}
			}
			subList.add((BitSet)B1.clone());
			subList.add((BitSet)B2.clone());
			reslutList.add(subList);
		}
		
		for (int i = 0; i < M; i++) {
			int result = 0;
			for (int j = 0; j < reslutList.get(i).get(0).length(); j++) {
				if (reslutList.get(i).get(0).get(j)) {
					result++;
				}
			}
			System.out.print(result + " ");
			result = 0;
			for (int j = 0; j < reslutList.get(i).get(1).length(); j++) {
				if (reslutList.get(i).get(1).get(j)) {
					result++;
				}
			}
			System.out.println(result);
		}
	}
}
