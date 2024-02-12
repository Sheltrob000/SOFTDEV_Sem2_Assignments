import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String fileName = "src/file.txt";


        Path filePath = Paths.get(fileName);
        List<String> lines = Files.readAllLines(filePath);

        for (int numlines = 0; numlines <= lines.size(); numlines++){
            System.out.println(lines.get(numlines));
        }

        // Loop through the list of lines

    }
}