import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        Calendar start = Calendar.getInstance();
        start.set(2026, Calendar.JUNE, 1, 0, 0, 0);
        start.set(Calendar.MILLISECOND, 0);

        Calendar release = Calendar.getInstance();
        release.set(2026, Calendar.JULY, 1, 0, 0, 0);
        release.set(Calendar.MILLISECOND, 0);

        long millis = release.getTimeInMillis() - start.getTimeInMillis();
        System.out.println(TimeUnit.MILLISECONDS.toDays(millis) + " Tage");
    }
}
