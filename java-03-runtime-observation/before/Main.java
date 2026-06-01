public class Main {

    public static void main(String[] args) {

        long sum = 0;

        for (int i = 0; i < 20_000_000; i++) {
            sum += i % 7;
        }

        System.out.println(sum);
    }
}
