import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = List.of("Ada", "Bob", "Grace");
        String first = names.getFirst();
        String last = names.getLast();

        System.out.println("erst=" + first + ", letztes=" + last);
        System.out.println(names.reversed());
    }
}
