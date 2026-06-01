import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List names = new ArrayList();
        names.add("Ada");
        names.add("Grace");

        for (Iterator it = names.iterator(); it.hasNext();) {
            String name = (String) it.next();
            System.out.println(name);
        }
    }
}
