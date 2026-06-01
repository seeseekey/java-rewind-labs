record Customer(String name) {}
record Order(Customer customer, double total) {}

public class Main {

    static String label(Object value) {

        if (value instanceof Order(Customer(String name), double total)) {
            return name + ": " + total;
        }

        return "unbekannt";
    }

    public static void main(String[] args) {
        System.out.println(label(new Order(new Customer("Ada"), 42.0)));
    }
}
