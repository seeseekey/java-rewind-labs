import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        var values = List.of(1, 2, 3, 4, 5);
        var windows = new ArrayList<List<Integer>>();

        for (int i = 0; i <= values.size() - 3; i++) {
            windows.add(values.subList(i, i + 3));
        }

        System.out.println(windows);
    }
}
