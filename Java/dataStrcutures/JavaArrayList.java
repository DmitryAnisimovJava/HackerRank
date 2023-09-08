package dataStrcutures;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
		int inLines = sc.nextInt();
		for (int i = 0; i <= inLines; i++) {
			ArrayList<Integer> subList = new ArrayList<>();
			String lineFromConsole = sc.nextLine().trim();
			if (!lineFromConsole.isBlank()) {
				String[] numbersFromConsole = lineFromConsole.trim().split("\\s");
				for (int j = 0; j < numbersFromConsole.length; j++) {
					subList.add(Integer.parseInt(numbersFromConsole[j]));
				}
				mainList.add(subList);
			}
		}
		int numberOfTests = sc.nextInt();
		Integer[][] casesList = new Integer[numberOfTests][2];
		for (int i = 0; i <= numberOfTests; i++) {
			String lineFromConsole = sc.nextLine().trim();
			if (!lineFromConsole.isBlank()) {
				String[] numbersFromConsole = lineFromConsole.trim().split("\\s");
				for (int j = 0; j < numbersFromConsole.length; j++) {
					casesList[i-1][j] = Integer.parseInt(numbersFromConsole[j]) ;
				}
			}
		}
		sc.close();
		for (int i = 0; i < casesList.length; i++) {
			try {
				int x = casesList[i][0] - 1;
				int y = casesList[i][1] ;
				System.out.println(mainList.get(x).get(y));
			} catch (Exception e) {
				System.out.println("ERROR!");
			}
		}
	}
}

