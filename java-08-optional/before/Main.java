public class Main {

    static String findEmail(String user) {

        if ("Ada".equals(user)) {
            return "ada@example.test";
        }

        return null;
    }

    public static void main(String[] args) {

        String email = findEmail("Grace");
        System.out.println(email == null ? "keine E-Mail" : email);
    }
}
