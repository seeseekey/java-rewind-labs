import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("geklickt");
            }
        };
        listener.actionPerformed(new ActionEvent(listener, 1, "click"));
    }
}
