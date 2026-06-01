import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws Exception {

        long start = System.currentTimeMillis();
        var executor = Executors.newFixedThreadPool(4);

        try {
            var results = IntStream.range(0, 40)
                .mapToObj(i -> executor.submit(() -> {
                    Thread.sleep(20);
                    return "Antwort " + i;
                }))
                .toList();

            for (var result : results) {
                result.get();
            }
        } finally {
            executor.shutdown();
        }

        System.out.println("fixed pool durationMs=" + (System.currentTimeMillis() - start));
    }
}
