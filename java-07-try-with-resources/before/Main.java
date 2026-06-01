import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    static String firstLine(File file) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(file));

        try {
            return reader.readLine();
        } finally {
            reader.close();
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(firstLine(new File("README.md")));
    }
}
