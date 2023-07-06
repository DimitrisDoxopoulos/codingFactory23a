package gr.aueb.cf.ch20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NonCapturingApp {

    public static void main(String[] args) {
        String s = "HelloWorld HelloWorldWorld";

        // ?: matches but does not capture
        // ?= does not match and does not capture
        Pattern pattern = Pattern.compile("(Hello)(?:World)+");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println(matcher.group(i));
            }
        }
    }
}
