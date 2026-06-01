public class Main {

    static final ThreadLocal<String> REQUEST_ID = new ThreadLocal<>();

    public static void main(String[] args) {
        REQUEST_ID.set("req-1");
        System.out.println(REQUEST_ID.get());
        REQUEST_ID.remove();
    }
}
