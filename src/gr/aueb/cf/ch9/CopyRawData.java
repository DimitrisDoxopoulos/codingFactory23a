package gr.aueb.cf.ch9;

import java.io.*;

/**
 * Copies a file to another. In this example, a video to another
 * Notice the speed difference between FileOutputStream, buffered
 * FIleOutputStream and BufferedOutputStream
 *
 * @author CF
 */
public class CopyRawData {

    public static void main(String[] args) {
        int b = 0;
        int count = 0;
        String rootPath = "C:\\Users\\Dimitris\\IdeaProjects\\CodingFactory22\\src\\gr\\aueb\\cf\\ch9\\data";
        byte[] buffer = new byte[4096];
        long start, end;
        double elapsed;

//        try (FileInputStream in = new FileInputStream(rootPath + "\\sample.mp4");
//            FileOutputStream out = new FileOutputStream(rootPath + "\\sampleOutput.mp4")) {
//
//            start = System.currentTimeMillis();
//            while ((b = in.read(buffer)) != -1) {
//                out.write(buffer, 0, b);
//                count += b;
//            }
//            end = System.currentTimeMillis();
//
//            elapsed = (end - start) / 1000.0;
//            System.out.println(elapsed + " secs");
//            System.out.printf("%,.2f KB", Math.ceil((double) count / 1024));
//        } catch (IOException ex) {
//            throw new RuntimeException();
//        }

        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(rootPath + "\\sample.mp4"));
             BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(rootPath + "\\sampleOutput.mp4"))) {

            start = System.currentTimeMillis();
            while ((b = in.read(buffer)) != -1) {
                out.write(buffer, 0, b);
                count += b;
            }
            end = System.currentTimeMillis();

            elapsed = (end - start) / 1000.0;
            System.out.println(elapsed + " secs");
            System.out.printf("%,.2f KB", Math.ceil((double) count / 1024));
        } catch (IOException ex) {
            throw new RuntimeException();
        }

    }
}
