import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Table {
    String value();
}

@Table("users")
final class UserRepository {
}

public class Main {

    public static void main(String[] args) {

        Table table = UserRepository.class.getAnnotation(Table.class);
        System.out.println(table.value());
    }
}
