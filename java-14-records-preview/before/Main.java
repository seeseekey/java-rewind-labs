import java.util.Objects;

final class User {

    private final String name;

    User(String name) { this.name = Objects.requireNonNull(name); }

    String name() { return name; }

    public String toString() { return "User[name=" + name + "]"; }
}

public class Main {

    public static void main(String[] args) {
        System.out.println(new User("Ada"));
    }
}
