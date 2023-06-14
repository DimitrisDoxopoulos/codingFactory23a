package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class WriterApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/javatmp/text1.txt");
             PrintWriter pw = new PrintWriter("C:/javatmp/text2.txt")) {

            ps.println("Hello CF! from print stream");
            pw.println("Hello CF! from print write");
        } catch (FileNotFoundException ex) {
            System.out.println("File path not found");
        }
    }
}
