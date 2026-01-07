import java.util.Scanner;

class Rectangle {
    double length;
    double breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void printArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }

    void printPerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }
}

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length:");
        double length = sc.nextDouble();

        System.out.println("Enter breadth:");
        double breadth = sc.nextDouble();

        Rectangle r = new Rectangle(length, breadth);

        r.printArea();
        r.printPerimeter();
    }
}
