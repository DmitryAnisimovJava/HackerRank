package strings;

import java.util.Scanner;

public class JavaRegex {

	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
	}
}

class MyRegex {
	
	final String pattern;
	public MyRegex() {
		pattern = MyRegex.getReGex();
	}
	
	private static String getReGex() {
		String regex = "(([2][5][0-5]\\.)|([2][0-4]?[0-9]\\.)|([0-1]?[0-9]?[0-9]\\.)){3}" +
		        "(([2][5][0-5])|([2][0-4]?[0-9])|([0-1]?[0-9]?[0-9])){1}";
		return regex;
	}
}

