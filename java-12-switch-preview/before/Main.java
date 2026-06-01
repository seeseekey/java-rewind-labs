public class Main {

    static String label(int status) {

        String result;

        switch (status) {
            case 1: result = "offen"; break;
            case 2: result = "fertig"; break;
            default: result = "unbekannt";
        }

        return result;
    }

    public static void main(String[] args) { System.out.println(label(1)); }
}
