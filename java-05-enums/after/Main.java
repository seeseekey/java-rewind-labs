enum Status {
    OPEN, DONE
}

public class Main {
    static String label(Status status) {
        switch (status) {
            case OPEN:
                return "Offen";
            case DONE:
                return "Erledigt";
            default:
                throw new IllegalArgumentException("Unbekannt: " + status);
        }
    }

    public static void main(String[] args) {
        System.out.println(label(Status.OPEN));
        System.out.println(label(Status.DONE));
    }
}
