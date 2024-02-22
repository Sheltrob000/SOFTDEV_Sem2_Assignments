import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String FILE_NAME = "src.testfilething.txt";
        Path newfilepath = Paths.get(FILE_NAME);
        
        try{Files.createFile(newfilepath);
        Files.createFile(newfilepath);
        } catch (FileAlreadyExistsException ex) {
        System.out.println("File already exists");
        }

        String fileName = "src/starter.txt";
        Path filePath = Paths.get(fileName);
        List<String> lines = Files.readAllLines(filePath);

        FileWriter fileWriter = new FileWriter(FILE_NAME);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        for (int i = 0; i <= lines.size(); i++){
            writer.write(lines.get(i));
        }
        writer.close();
        





    }}
