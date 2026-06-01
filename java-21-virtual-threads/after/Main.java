import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws Exception {

        long start = System.currentTimeMillis();

        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {

            var results = IntStream.range(0, 40)
                .mapToObj(i -> executor.submit(() -> {
                    Thread.sleep(20);
                    return "Antwort " + i;
                }))
                .toList();

            for (var result : results) {
                result.get();
            }
        }

        System.out.println("virtual threads durationMs=" + (System.currentTimeMillis() - start));
    }
}
