import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, List<Integer>> scores = new HashMap<String, List<Integer>>();
        scores.put("team", List.of(1, 2, 3));

        System.out.println(scores);
    }
}
