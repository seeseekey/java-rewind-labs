public class Main {

    static String label(int status) {
        return switch (status) {
            case 1 -> "offen";
            case 2 -> "fertig";
            default -> "unbekannt";
        };
    }

    public static void main(String[] args) { System.out.println(label(1)); }
}
