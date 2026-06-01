public class Main {

    static String upper(Object value) {

        if (value instanceof String) {
            String text = (String) value;
            return text.toUpperCase();
        }

        return "";
    }

    public static void main(String[] args) {
        System.out.println(upper("Ada"));
    }
}
