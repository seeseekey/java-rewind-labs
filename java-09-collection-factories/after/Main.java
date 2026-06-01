import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = List.of("Ada", "Grace");
        System.out.println(names);

        try {
            names.add("Linus");
        } catch (UnsupportedOperationException ex) {
            System.out.println("Mutation blockiert");
        }
    }
}
