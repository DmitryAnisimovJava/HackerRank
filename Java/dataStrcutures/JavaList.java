package dataStrcutures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		List<Integer> inputList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			inputList.add(sc.nextInt());
		}
		int quantityOfQueries = sc.nextInt();
		for (int i = 0; i < quantityOfQueries; i++) {
			String query = sc.next().trim();
			if (query.equals("Insert")) {
				int index = sc.nextInt();
				int number = sc.nextInt();
				if (index <= inputList.size()) {
					inputList.add(index, number);
				} 
			}
			if (query.equals("Delete")) {
				int index = sc.nextInt();
				if (index < inputList.size()) {
					inputList.remove(index);
				}
			}
		}
		for (int i = 0; i < inputList.size(); i++) {
			System.out.print(inputList.get(i) + " ");
		}
	}
}
