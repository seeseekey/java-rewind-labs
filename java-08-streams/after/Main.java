import java.util.Arrays;
import java.util.List;

public class Main {

    static final class User {

        private final String name;
        private final boolean active;

        User(String name, boolean active) {
            this.name = name;
            this.active = active;
        }

        String name() { return name; }
        boolean active() { return active; }
    }

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
            new User("Ada", true),
            new User("Bob", false),
            new User("Grace", true)
        );

        List<String> result = users.stream()
            .filter(User::active)
            .map(User::name)
            .map(String::toUpperCase)
            .collect(java.util.stream.Collectors.toList());

        System.out.println(result);
    }
}
