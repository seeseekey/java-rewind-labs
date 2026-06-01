import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static final Charset UTF_8 = Charset.forName("UTF-8");
    static final Pattern USER_LINE = Pattern.compile("(?m)^user=([a-z][a-z0-9_]{2,15})$");

    static ByteBuffer message() {
        return UTF_8.encode("user=ada_01\nrole=admin\n");
    }

    static String decode(ByteBuffer payload) {
        assert payload.hasRemaining() : "fixture payload must not be empty";
        return UTF_8.decode(payload).toString();
    }

    static String userFrom(String text) {

        Matcher matcher = USER_LINE.matcher(text);

        if (!matcher.find()) {
            throw new IllegalArgumentException("missing or invalid user");
        }

        String user = matcher.group(1);
        assert user.length() >= 3 : "regex guarantees minimum length";

        return user;
    }

    public static void main(String[] args) {
        String user = userFrom(decode(message()));
        System.out.println("ok: " + user);
    }
}
