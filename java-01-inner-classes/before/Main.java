import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    static class ClickListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.out.println("geklickt");
        }
    }

    public static void main(String[] args) {
        ActionListener listener = new ClickListener();
        listener.actionPerformed(new ActionEvent(listener, 1, "click"));
    }
}
