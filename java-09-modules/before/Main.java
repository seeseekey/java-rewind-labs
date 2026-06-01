import org.example.workshop.api.Greeting;
import org.example.workshop.internal.PrefixFormatter;

public class Main {

    public static void main(String[] args) {

        Greeting greeting = new Greeting(new PrefixFormatter("Classpath"));
        System.out.println(greeting.text("Ada"));
        System.out.println("Vor Java 9 kann Anwendungscode interne Klassen direkt verwenden.");
    }
}
