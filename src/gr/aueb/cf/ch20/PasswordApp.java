package gr.aueb.cf.ch20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * at least 6 chars and at least one uppercase
 *
 */
public class PasswordApp {
    public static void main(String[] args) {
        String password = "Addddd24";

        // ?= just assert, do not match, do not capture
        Pattern pattern = Pattern.compile("(?=.*?[A-Z])(?=.*?[0-9])^.{6,}$");
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            System.out.println(matcher.group());
        }
    }
}
