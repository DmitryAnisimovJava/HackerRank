package strings;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class TagContextCreator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();
            AtomicBoolean found = new AtomicBoolean(false);
            Pattern tagPattern = Pattern.compile("<(?<name>[^<>/]+)+>([^<>/]+)</\\k<name>>");
            Matcher tagMatcher = tagPattern.matcher(line);
            Stream<MatchResult> results = tagMatcher.results();
            results.forEach(matchResult ->{
                found.set(true);
                System.out.println(matchResult.group(2));
            });
            if (!found.get()) {
                System.out.println("None");
            }
            testCases--;
        }
        in.close();
    }
}
