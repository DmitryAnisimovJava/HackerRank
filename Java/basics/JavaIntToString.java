package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaIntToString {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int integerFromConsole = Integer.parseInt(bf.readLine().trim());
		String s = Integer.valueOf(integerFromConsole).toString();
		System.out.println(s);
		bf.close();
	}
}

