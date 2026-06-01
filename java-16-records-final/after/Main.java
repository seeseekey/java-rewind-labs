record User(String name) {
    User {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name darf nicht leer sein");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new User("Ada"));
    }
}
