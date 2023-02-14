import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtils extends Thread {
    public static void WriteToFile(String fileName, String input) {
        new Thread(() -> {
            try {
                File file = new File(fileName);
                FileWriter writer = new FileWriter(file);
                writer.write(input);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }

    public static String ReadFromFile(String fileName) {
        try {
            return new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (Exception e) {
            System.out.println("Jotain meni pieleen..");
            return null;
        }
    }
}
