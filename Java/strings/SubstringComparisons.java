package strings;


import java.util.Scanner;

public class SubstringComparisons {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(SmallestAndLargest.getSmallestAndLargest(s, k));
        System.out.println((int)'w');
	}
}

class SmallestAndLargest {
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
        String largest = "";
        java.util.ArrayList<String> listOfStrings = new java.util.ArrayList<>();
		for (int i = 0; i < s.length() - k + 1; i++) {
			listOfStrings.add(s.substring(i, i + k));
		}
		smallest = findSmallest(listOfStrings, k);
		largest = findLargest(listOfStrings, k);
		
	return smallest + "\n" + largest;
	}
	 public static String findSmallest(java.util.ArrayList<String> list, int k) {
		 String smallest = list.get(0);
		 for (int i = 1; i < list.size(); i++) {
			for (int j = 0; j <= k - 1; j++) {
				if ((int) smallest.charAt(j) < (int) list.get(i).charAt(j)) {
					break;
				}
				if ((int) smallest.charAt(j) > (int) list.get(i).charAt(j)) {
					smallest = list.get(i);
					break;
				}
			}
		}
		return smallest;
	}
	 
	 public static String findLargest(java.util.ArrayList<String> list, int k) {
		 String largest = list.get(0);
		 for (int i = 1; i < list.size(); i++) {
			for (int j = 0; j <= k - 1; j++) {
				if ((int) largest.charAt(j) < (int) list.get(i).charAt(j)) {
					largest = list.get(i);
					break;
				}
				if ((int) largest.charAt(j) > (int) list.get(i).charAt(j)) {
					break;
				}
			}
		}
		 return largest;
	}
}	 
