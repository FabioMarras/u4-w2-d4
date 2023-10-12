package fabiomarras.files;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FilesMain {
    public static void main(String[] args) {
        File file = new File("src/output.txt");
        try {
            FileUtils.writeStringToFile(file, "CIAONE" + System.lineSeparator(), StandardCharsets.UTF_8);
            FileUtils.writeStringToFile(file, "Fabio" + System.lineSeparator(), StandardCharsets.UTF_8, true);
            //FileUtils.writeStringToFile(file, "CIAONE2", StandardCharsets.UTF_8);
            String cont = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
            System.out.println("find: " + cont);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
