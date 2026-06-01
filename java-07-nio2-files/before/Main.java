import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        File dir = new File(".lab-build/java-07-nio2-files-before");
        if (!dir.exists() && !dir.mkdirs()) {
            throw new IllegalStateException("Verzeichnis konnte nicht erstellt werden");
        }

        File file = new File(dir, "name.txt");
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Ada");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            System.out.println(reader.readLine());
        }
    }
}
