package basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class DateAndTime {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("C:\\Users\\Anisi\\Desktop\\output.txt")));

        String firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "");

        

        
        System.out.println(firstMultipleInput);
        bufferedWriter.write(firstMultipleInput);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
	}
}

class Result {
	
	//public static String findDay(int month, int day, int year) {
		
	//}
}
