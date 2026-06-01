import module java.base;

public class Main {

    /// Begruesst eine Person.
    ///
    /// - nutzt einen Namen
    /// - liefert einen Text
    static String hello(String name) { return "Hallo " + name; }

    public static void main(String[] args) {

        List<String> names = List.of("Ada", "Grace");
        names.stream().map(Main::hello).forEach(System.out::println);
    }
}
