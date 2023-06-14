package gr.aueb.cf.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioCopyApp {

    public static void main(String[] args) {
        byte[] videoBytes;
        String rootPath = "C:\\Users\\Dimitris\\IdeaProjects\\CodingFactory22\\src\\gr\\aueb\\cf\\ch9\\data";

        Path sourcePath = Paths.get(rootPath + "\\sample.mp4");
        Path targetPath = Paths.get(rootPath + "\\nioCopiedVideo.mp4");

        try {
            videoBytes = Files.readAllBytes(sourcePath);
            Files.write(targetPath, videoBytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
