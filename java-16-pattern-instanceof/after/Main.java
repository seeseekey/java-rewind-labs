public class Main {

    static String upper(Object value) {

        if (value instanceof String text) {
            return text.toUpperCase();
        }

        return "";
    }

    public static void main(String[] args) {
        System.out.println(upper("Ada"));
    }
}
