package gr.aueb.cf.ch6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Populate an array from a file
 *
 * @autor CF
 */
public class PopulateFromFile {

    public static void main(String[] args) throws FileNotFoundException {
        // Creating a txt file...
        File file = new File("C:\\Users\\User\\IdeaProjects\\CodingFactory22\\src\\gr\\aueb\\cf\\ch6\\infile.txt");
        Scanner in = new Scanner(file);

        int[] grades = new int[5];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = in.nextInt();
        }

        for (int grade : grades) {
            System.out.println(grade + " ");
        }
    }
}
