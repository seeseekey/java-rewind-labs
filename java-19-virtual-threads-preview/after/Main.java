import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws Exception {

        long start = System.currentTimeMillis();

        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {

            var futures = IntStream.range(0, 40)
                .mapToObj(i -> executor.submit(() -> {
                    Thread.sleep(20);
                    return "task-" + i;
                }))
                .toList();

            for (var future : futures) {
                future.get();
            }
        }

        System.out.println("virtual threads durationMs=" + (System.currentTimeMillis() - start));
    }
}
