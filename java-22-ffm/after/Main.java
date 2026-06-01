import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public class Main {

    public static void main(String[] args) {

        try (Arena arena = Arena.ofConfined()) {

            MemorySegment segment = arena.allocate(ValueLayout.JAVA_INT);
            segment.set(ValueLayout.JAVA_INT, 0, 42);
            System.out.println(segment.get(ValueLayout.JAVA_INT, 0));
        }
    }
}
