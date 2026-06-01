public class Main {

    static final String MESSAGE = "user=ada_01\nrole=admin\n";

    static String userFrom(String text) {

        int prefix = text.indexOf("user=");

        if (prefix < 0) {
            throw new IllegalArgumentException("missing user");
        }

        int start = prefix + "user=".length();
        int end = text.indexOf('\n', start);

        if (end < 0) {
            end = text.length();
        }

        return text.substring(start, end);
    }

    static boolean isUserName(String value) {

        if (value.length() < 3 || value.length() > 16) {
            return false;
        }

        if (!isLowercaseLetter(value.charAt(0))) {
            return false;
        }

        for (int i = 1; i < value.length(); i++) {

            char c = value.charAt(i);

            if (!isLowercaseLetter(c) && !isDigit(c) && c != '_') {
                return false;
            }
        }

        return true;
    }

    static boolean isLowercaseLetter(char c) {
        return c >= 'a' && c <= 'z';
    }

    static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    public static void main(String[] args) {

        String user = userFrom(MESSAGE);

        if (!isUserName(user)) {
            throw new IllegalArgumentException("invalid user: " + user);
        }
        
        System.out.println("ok: " + user);
    }
}
