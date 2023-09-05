package strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContextCreator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	Pattern tagPattern = Pattern.compile("((<([[\\p{Print}&&[^>]]//s*]+)>)+)([^<]+)(</\\3>)+");
          	Matcher tagMatcher = tagPattern.matcher(line);
          	try {
          		tagMatcher.find();
          		System.out.println(tagMatcher.group(4));
			} catch (IllegalStateException e) {
				System.out.println("None");
          
          	
          	
			
			testCases--;
		}

	}
  }
}
