package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Java Util Logging
 *
 * When an exception occurs, we have to keep a log
 * for it, so we can notice and handle it
 *
 * Using the Class JavaUtil, we can log stuff
 *
 * @author CF
 */
public class JULApp {

    public static void main(String[] args) {
        try {
            Scanner sc = getFIleDescriptor("C:\\tmp\\test-15.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }

    /**
     * Provides the name of a file so the Scanner can read it
     *
     * If the file that we have to use with the Scanner does not exist
     * a checked exception is happening, so we can handle it.
     *
     * @param s     String  the name of a file
     * @return      The contains of the file
     */
    public static Scanner getFIleDescriptor(String s) throws FileNotFoundException {
        File fd = new File(s);
        Logger logger = getLogger();

        try {
            return new Scanner(fd);
        } catch (FileNotFoundException ex) {
            logger.severe("File not found: " + ex.getMessage());
            throw ex;
        }
    }

    public static Logger getLogger() {
        Logger logger = Logger.getLogger(JULApp.class.getName());
        Handler fileHandler;

        try {
            fileHandler = new FileHandler("cf.log", true);
            // Without specifying the SimpleFormatter, the resulting log
            // will be of .xml type
            fileHandler.setFormatter(new SimpleFormatter());
        } catch (IOException ex) {
            throw new RuntimeException();
        }

        logger.addHandler(fileHandler);
        return logger;
    }
}
