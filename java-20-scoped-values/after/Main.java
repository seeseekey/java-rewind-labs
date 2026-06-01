public class Main {

    static final ScopedValue<String> REQUEST_ID = ScopedValue.newInstance();

    public static void main(String[] args) {
        ScopedValue.where(REQUEST_ID, "req-1").run(() -> System.out.println(REQUEST_ID.get()));
    }
}
