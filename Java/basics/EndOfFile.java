package basics;

import java.util.Scanner;

public class EndOfFile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 1;
		while (sc.hasNext()) {
			String lineFromConsole = sc.nextLine();
			if (lineFromConsole.isEmpty()) {
				break;
			}
			System.out.println(counter + " " + lineFromConsole);
			counter++;
		}

	}

}
