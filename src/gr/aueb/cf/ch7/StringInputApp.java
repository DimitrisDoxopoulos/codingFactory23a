package gr.aueb.cf.ch7;

import java.util.Scanner;

public class StringInputApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;

        System.out.println("Please provide a string");
//        s = in.next(); // Reads the next string that ends with whitespace (space, tab, new line)
        s = in.nextLine(); // Reads lines without stopping on whitespace

        System.out.println(s);
    }
}
