public class Main {

    public static void main(String[] args) {

        long start = System.nanoTime();
        long sum = 0;

        for (int i = 0; i < 20_000_000; i++) {
            sum += i % 7;
        }

        long durationMs = (System.nanoTime() - start) / 1_000_000;
        System.out.println("sum=" + sum + ", durationMs=" + durationMs);
    }
}
