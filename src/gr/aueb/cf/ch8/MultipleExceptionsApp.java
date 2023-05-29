package gr.aueb.cf.ch8;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * We can handle multiple exceptions but in the catches
 * we have to go from the most specific error (first catch)
 * to the most generic one (last catch)
 *
 * @author CF
 */
public class MultipleExceptionsApp {

    public static void main(String[] args) {
        File file = new File("C:\\tmp\\random-file.txt");
        char ch;

        try (Scanner in = new Scanner(file)) {
            ch = (char) System.in.read();
        } catch (IOException e1) {
            System.out.println("Read Error");
        } catch (Exception e2) {
            System.out.println("Oops... Something went wrong!");
        }
    }
}
