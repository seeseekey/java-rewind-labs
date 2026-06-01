sealed interface Payment permits Card, Wire {}
record Card(String token) implements Payment {}
record Wire(String iban) implements Payment {}

public class Main {

    static String label(Payment payment) {

        return switch (payment) {
            case Card c -> "Karte";
            case Wire w -> "Überweisung";
        };
    }

    public static void main(String[] args) {
        System.out.println(label(new Card("tok")));
    }
}
