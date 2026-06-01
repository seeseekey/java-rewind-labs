import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Main {

    public static void main(String[] args) {

        ByteBuffer buffer = ByteBuffer.allocateDirect(Integer.BYTES).order(ByteOrder.nativeOrder());
        buffer.putInt(0, 42);
        System.out.println(buffer.getInt(0));
        System.out.println("Direkter Speicher ohne klaren Scope im Code.");
    }
}
