package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Prints with PrintStream
 *
 * @author CF
 */
public class PrintStreamApp {

    public static void main(String[] args) {
        // remember try with resources. PrintStream is autocloseable
        // StandardCharsets. gives the charset that we want to use
        try (PrintStream ps = new PrintStream("C:/javatmp/f23.txt", StandardCharsets.UTF_8)) {
            ps.println("Hello coding Factory");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
