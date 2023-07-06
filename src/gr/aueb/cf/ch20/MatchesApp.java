package gr.aueb.cf.ch20;

public class MatchesApp {
    public static void main(String[] args) {
        String s = "red";
        System.out.println(isRed(s));

        String digit = "1";
        System.out.println(isOnedigit(digit));


    }

    public static boolean isRed(String s) {
        return s.matches("red");
    }

    public static boolean isRedOrGreen(String s) {
        return s.matches("red|green");
    }

    public static boolean isOnedigit(String s) {
//        return s.matches("[12356789]");
        return s.matches("\\d");
    }

    public static boolean isOneWordChar(String s) {
//        return s.matches("[a-zA-Z0-9_]");
        return s.matches("\\w");
    }

    public static boolean isNotOneDigit(String s) {
        // \D is the negative of \d, meaning not a digit
        return s.matches("\\D");
    }

    public static boolean isNotOneWordChar(String s) {
        return s.matches("\\W");
    }

    public static boolean isWhitespace(String s) {
        return s.matches("\\s");
    }

    public static boolean isNotWhitespace(String s) {
        return s.matches("\\S");
    }

    public static boolean isAnySymbol(String s) {
        return s.matches(".");
    }

    public static boolean isWholeString(String s) {
        return s.matches("^.$");
    }

    /**
     * . any char
     * ^, $ start and end of a string
     * [^] negation
     * \d, \D digit and not digit
     * \w, \W a-zA-Z0-9_ and not
     * \s, \S space, not space
     */

    public static boolean isZeroOrMoreDigits(String s) {
        return s.matches("\\d*");
    }

    public static boolean isOneOrMoreDigits(String s) {
        return s.matches("\\d+");
    }

    public static boolean isThreeDigits(String s) {
        return s.matches("\\d{3}");
    }

    public static boolean isZeroToThreeDigits(String s) {
        return s.matches("\\d{1,3}");
    }

    public static boolean isMoreThanFiveDigits(String s) {
        return s.matches("\\d{5,}");
    }

    public static boolean isLessThanFiveDigits(String s) {
        return s.matches("\\d{0,5}");
    }

    public static boolean isZeroOrOneAnySymbol(String s) {
        return s.matches(".?");
    }

    public static boolean isValidEmailAddress(String s) {
        return s.matches("^\\w+\\.?\\w+@\\w+\\.(com|gr)$");
    }
}
