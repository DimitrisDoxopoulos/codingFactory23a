package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class AutoFlushApp {

    public static void main(String[] args) {
        // By giving the second parameter of fileOutputStream as true,
        // instead of creating a new file each time we run the code
        // we append the new text if the file is already created
        try (PrintStream ps = new PrintStream(
                new FileOutputStream("C:/javatmp/fos.txt", true), true, StandardCharsets.UTF_8)
        ) {
            ps.println("Καλησπέρα με ελληνικούς χαρακτήρες");
        } catch (FileNotFoundException fex) {
            fex.printStackTrace();
        }
    }
}
