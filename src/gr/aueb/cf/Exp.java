package gr.aueb.cf;

import java.util.Scanner;

public class Exp {
    public static void main(String[] args) {
        String message = getMessage();
        System.out.println("Your message is \"" + message + "\"");
        String codedString = String.valueOf(code(message));
        System.out.println("Your message coded is \"" + codedString + "\"");
        String decodedString = String.valueOf(decode(codedString));
        System.out.println("Your message decoded is \"" + decodedString + "\"");
    }

    public static String getMessage() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please provide a message");
        return in.nextLine();
    }

    public static StringBuilder code(String message) {
        StringBuilder coded = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            int nextAscii = ((int) message.toCharArray()[i]) + 1;
            coded.append((char) nextAscii);
        }
        return coded;
    }

    public static StringBuilder decode(String codedMessage) {
        StringBuilder decoded = new StringBuilder();
        for (int i = 0; i < codedMessage.length(); i++) {
            int previousAscii = ((int) codedMessage.toCharArray()[i]) - 1;
            decoded.append((char) previousAscii);
        }
        return decoded;
    }
}
