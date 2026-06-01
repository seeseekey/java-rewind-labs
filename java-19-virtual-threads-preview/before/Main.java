import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws Exception {

        long start = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(4);

        try {
            var futures = IntStream.range(0, 40)
                .mapToObj(i -> executor.submit(() -> {
                    Thread.sleep(20);
                    return "task-" + i;
                }))
                .toList();

            for (var future : futures) {
                future.get();
            }
        } finally {
            executor.shutdown();
        }

        System.out.println("fixed pool durationMs=" + (System.currentTimeMillis() - start));
    }
}
