package gr.aueb.cf.ch7;

public class ForStringApp {

    public static void main(String[] args) {
        String s = "Coding Factory";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }

        System.out.println('\u2764');

        for (char ch : s.toCharArray()) {
            System.out.print(ch + " ");
        }
        System.out.println();
        int index = s.indexOf("od");
        System.out.println(index);

        // Second param, where should indexOf start searching?
        int index2 = s.indexOf("0", 7);
        System.out.println(index2);

        // Start searching from the end of the string
        int index3 = s.lastIndexOf('y');
        System.out.println(index3);

        // Returns boolean. Case sensitive
        if (s.startsWith("Factory")) {
            System.out.println(s);
        } else {
            System.out.println("Wrong");
        }

        String substring = s.substring(0, 6);
        System.out.println(substring);

        String s2 = "Athens University of Economics and Business";

        for (int i = 0; i < s2.length(); i++) {
            System.out.print(s2.substring(i, i + 1));
        }
    }
}
