public class Main {

    static final String OPEN = "OPEN";
    static final String DONE = "DONE";

    static String label(String status) {

        if (OPEN.equals(status)) {
            return "Offen";
        }

        if (DONE.equals(status)) {
            return "Erledigt";
        }

        return "Unbekannt: " + status;
    }

    public static void main(String[] args) {
        System.out.println(label(OPEN));
        System.out.println(label("CLOSED"));
    }
}
