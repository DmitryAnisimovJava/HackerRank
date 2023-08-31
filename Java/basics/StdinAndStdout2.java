package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StdinAndStdout2 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int firstLine = Integer.parseInt(bufferedReader.readLine().trim());
		double secondLine = Double.parseDouble(bufferedReader.readLine().trim());
		String thirdLine = bufferedReader.readLine().trim();
		bufferedReader.close();
		System.out.println("String: " + thirdLine);
		System.out.println("Double: " + secondLine);
		System.out.println("Int: " + firstLine);		
	}

}
