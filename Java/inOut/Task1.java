package inOut;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/*
 * Задан текст, найти все слова с гласной буквы
 * 
 */

public class Task1 {

	private static final String VOWELS = "а, я, у, ю, о, е, ё, э, и, ы";

	public static void main(String[] args) throws IOException {
		Path path = Path.of("resources", "task1.txt");
		Scanner scanner = new Scanner(path);
		String result = "";
		while (scanner.hasNext()) {
			String text = (String) scanner.next();
			String vowelsToCheck = VOWELS.replace(",", "").replace(" ", "");
			if (vowelsToCheck.contains(text.subSequence(0, 1))) {
				result = result + text + "\n";
			}
		}
		System.out.println(result);
	}
}
