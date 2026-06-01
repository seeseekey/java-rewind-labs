import java.util.Optional;

public class Main {

    static Optional<String> findEmail(String user) {

        if ("Ada".equals(user)) {
            return Optional.of("ada@example.test");
        }

        return Optional.empty();
    }

    public static void main(String[] args) {
        System.out.println(findEmail("Grace").orElse("keine E-Mail"));
    }
}
