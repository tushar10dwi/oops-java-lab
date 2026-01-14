// Interface Motor
interface Motor {
    int capacity = 5;   // interface data member

    void run();
    void consume();
}

// WashingMachine class implements Motor
class WashingMachine implements Motor {

    public void run() {
        System.out.println("Washing machine is running");
    }

    public void consume() {
        System.out.println("Washing machine is consuming power");
    }
}

// Separate Main class
public class Q1 {
    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine();

        wm.run();
        wm.consume();

        // Accessing interface data member
        System.out.println("Capacity of the motor is " + wm.capacity);
    }
}
