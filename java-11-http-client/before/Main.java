import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws Exception {

        URL url = URI.create("https://example.com").toURL();
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        try {
            connection.setRequestMethod("GET");
            System.out.println(connection.getResponseCode());
        } finally {
            connection.disconnect();
        }
    }
}
