package gr.aueb.cf.ch20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Algorithms like match are greedy. They will search for the last
 * occurrence of a character to make a group
 *
 * We have to handle that greediness and make them reluctant
 * bu using ? before the delimiter symbol
 */
public class GreedyApp {

    public static void main(String[] args) {
        String passwordFile = "thanos:1234;chris:5678;alice:8967;";

        Pattern pattern = Pattern.compile(".*?;");
        Matcher matcher = pattern.matcher(passwordFile);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
