import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(List.of("Ada", "Bob", "Grace"));
        String first = names.get(0);
        String last = names.get(names.size() - 1);

        List<String> reversed = new ArrayList<>(names);
        Collections.reverse(reversed);

        System.out.println("erst=" + first + ", letztes=" + last);
        System.out.println(reversed);
    }
}
