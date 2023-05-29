package gr.aueb.cf.ch7;

public class LowerUpperTrimApp {

    public static void main(String[] args) {
        String s = "Athens Uni";
        String lowercase;
        String uppercase;
        String trimmed;
        String s2 = " ";

        lowercase = s.toLowerCase();
        uppercase = s.toUpperCase();
        trimmed = s.trim();

        System.out.println("*".repeat(10));

        if (s2.isEmpty()) {
            System.out.println("Empty");
        }

        if (s2.isBlank()) {
            System.out.println("Blank");
        }
    }
}
