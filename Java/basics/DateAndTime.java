package basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.util.Calendar;

public class DateAndTime {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("C:\\Users\\Anisi\\Desktop\\output.txt")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);
        
        bufferedWriter.write(res);
        System.out.println(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
	}
}

class Result {
	
	public static String findDay(int month, int day, int year) {
		Calendar myCalendar = Calendar.getInstance();
		myCalendar.set(year, month - 1, day);
		String dayInWeek = switch (myCalendar.get(Calendar.DAY_OF_WEEK)) {
		case 1 -> "SUNDAY";
		case 2 -> "MONDAY";
		case 3 -> "TUESDAY";
		case 4 -> "WEDNESDAY";
		case 5 -> "THURSDAY";
		case 6 -> "FRIDAY";
		case 7 -> "SATURDAY";
		default -> "Mistake in Date Number";
		};
		return dayInWeek;
	}
}
