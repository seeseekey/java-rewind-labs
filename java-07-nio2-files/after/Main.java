import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception {
        Path dir = Paths.get(".lab-build/java-07-nio2-files-after");
        Files.createDirectories(dir);

        Path file = dir.resolve("name.txt");
        Files.write(file, "Ada".getBytes(StandardCharsets.UTF_8));

        System.out.println(Files.readAllLines(file, StandardCharsets.UTF_8).get(0));
    }
}
