import java.util.*;
import java.io.*;

// Main Class
public class BeanEventDemo {

    // Custom Event Class
    static class MyEvent extends EventObject {
        public MyEvent(Object source) {
            super(source);
        }
    }

    // Listener Interface
    interface MyListener extends EventListener {
        void eventOccurred(MyEvent e);
    }

    // JavaBean Class
    static class MyBean implements Serializable {

        private List<MyListener> listeners = new ArrayList<>();

        // Method to add listener
        public void addMyListener(MyListener l) {
            listeners.add(l);
        }

        // Method to fire event
        public void fireEvent() {
            MyEvent event = new MyEvent(this);
            for (MyListener l : listeners) {
                l.eventOccurred(event);
            }
        }
    }

    // Main Method
    public static void main(String[] args) {

        MyBean bean = new MyBean();

        // Register Listener
        bean.addMyListener(new MyListener() {
            public void eventOccurred(MyEvent e) {
                System.out.println("Custom Event Triggered Successfully!");
            }
        });

        // Fire Event
        bean.fireEvent();
    }
}