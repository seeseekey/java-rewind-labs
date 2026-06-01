import java.io.File;
import java.io.FileWriter;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class Main {

    public static void main(String[] args) throws Exception {

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

        if (compiler == null) {
            throw new IllegalStateException("Kein Compiler im Runtime-Image");
        }

        File dir = new File(".lab-build/compiler-api");
        dir.mkdirs();

        File sourceFile = new File(dir, "Generated.java");

        try (FileWriter writer = new FileWriter(sourceFile)) {
            writer.write("public class Generated { public String message() { return \"Hallo Compiler API\"; } }");
        }

        int exitCode = compiler.run(null, null, null, sourceFile.getPath());
        System.out.println("Compiler API Exit-Code: " + exitCode);
        System.out.println("Class-Datei erzeugt: " + new File(dir, "Generated.class").exists());
    }
}
