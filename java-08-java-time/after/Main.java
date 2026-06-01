import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {

        LocalDate start = LocalDate.of(2026, 6, 1);
        LocalDate release = LocalDate.of(2026, 7, 1);

        long days = ChronoUnit.DAYS.between(start, release);
        System.out.println(days + " Tage");
    }
}
