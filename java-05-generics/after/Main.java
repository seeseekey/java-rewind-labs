import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();
        names.add("Ada");
        names.add("Grace");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
