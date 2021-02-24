package classExerciseOne;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesAndStreams {
    public static boolean isValidPath(String filePath) throws FileNotFoundException {
        boolean result = true;
        String empty = " ";
        if (filePath == null || filePath.equalsIgnoreCase(empty)) {
            throw new FileNotFoundException("please provide a file path");
        }

        Path thePath = Paths.get(filePath);
        if (!Files.exists(thePath)) {
            throw new FileNotFoundException("Cannot find the path");
        }
        return result;
    }

    public static String getFileName(String path) throws FileNotFoundException {
        String name = "";
        if (isValidPath(path)) {
            Path filePath = Paths.get(path);
            name = filePath.getFileName().toString();
        }
        return name;
    }


}
