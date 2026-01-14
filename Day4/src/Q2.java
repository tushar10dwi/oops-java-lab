import java.util.Scanner;

// Abstract class
abstract class Student {
    int rollNo;
    long regNo;

    void getInput(int r, long reg) {
        rollNo = r;
        regNo = reg;
    }

    abstract void course();
}

// Subclass
class Kiitian extends Student {

    @Override
    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }

    void display() {
        System.out.println("Rollno - " + rollNo);
        System.out.println("Registration no - " + regNo);
        course();
    }
}

// Driver class
public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rollno: ");
        int roll = sc.nextInt();

        System.out.print("Enter Registration no: ");
        long reg = sc.nextLong();

        Student s = new Kiitian();   // Abstract class reference
        s.getInput(roll, reg);

        Kiitian k = (Kiitian) s;     // Downcasting to access display()
        k.display();

        sc.close();
    }
}
