import java.util.*;

// Custom Event Class
class MyEvent extends EventObject {
    public MyEvent(Object source) {
        super(source);
    }
}

// Event Listener Interface
interface MyEventListener extends EventListener {
    void handleEvent(MyEvent e);
}

// JavaBean Class
class MyBean {
    private MyEventListener listener;

    // Register listener
    public void addMyEventListener(MyEventListener listener) {
        this.listener = listener;
    }

    // Fire event
    public void triggerEvent() {
        if (listener != null) {
            listener.handleEvent(new MyEvent(this));
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        MyBean bean = new MyBean();

        // Register listener
        bean.addMyEventListener(new MyEventListener() {
            public void handleEvent(MyEvent e) {
                System.out.println("Custom Event Triggered!");
            }
        });

        // Trigger event
        bean.triggerEvent();
    }
}