package dataStrcutures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapChallenge {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		Map<String, Integer> phoneBook = new HashMap<>();
		for(int i=0;i<n;i++) {
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
			phoneBook.put(name, phone);
		}
		List<String> result = new ArrayList<>();
		while(in.hasNext()) {
			String s=in.nextLine();
			if (phoneBook.containsKey(s)) {
				result.add(s + "=" + phoneBook.get(s));
			} else {
				result.add("Not found");
			}
		}
		for (Iterator<String> iterator = result.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
}

