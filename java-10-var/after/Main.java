import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        var scores = new HashMap<String, List<Integer>>();
        scores.put("team", List.of(1, 2, 3));

        System.out.println(scores);
    }
}
