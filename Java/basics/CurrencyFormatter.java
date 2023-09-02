package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyFormatter {

	public static void main(String[] args) {
		try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));) {
			double numberFromConsole = Double.parseDouble(bf.readLine().trim());
			String us = NumberFormat.getCurrencyInstance(Locale.US).format(numberFromConsole);
			System.out.printf("US: %s%n", us);
			NumberFormat indiaFormat = NumberFormat.getCurrencyInstance();
			indiaFormat.setCurrency(Currency.getInstance("INR"));
			System.out.printf("India: %s%n", indiaFormat.format(numberFromConsole));
			String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(numberFromConsole);
			System.out.printf("China: %s%n", china);
			String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(numberFromConsole);
			System.out.printf("France: %s%n", france);
			
		} catch (IOException e) {
			System.out.println( e.getMessage() + "" + e.getStackTrace());
		}

	}

}
