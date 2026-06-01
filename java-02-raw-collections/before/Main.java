import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List names = new ArrayList();

        names.add("Ada");
        names.add(42);

        for (Object value : names) {
            String name = (String) value;
            System.out.println(name.toUpperCase());
        }
    }
}
