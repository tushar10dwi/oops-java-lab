import java.util.Scanner;

class Plate {
    double length, width;

    Plate(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate Constructor Called");
    }

    void display() {
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
    }
}

class Box2 extends Plate {
    double height;

    Box2(double length, double width, double height) {
        super(length, width);   // calling Plate constructor
        this.height = height;
        System.out.println("Box Constructor Called");
    }

    void display() {
        super.display();
        System.out.println("Height = " + height);
    }
}

// Derived class
class WoodBox extends Box2 {
    double thick;

    WoodBox(double length, double width, double height, double thick) {
        super(length, width, height);  // calling Box constructor
        this.thick = thick;
        System.out.println("WoodBox Constructor Called");
    }

    void display() {
        super.display();
        System.out.println("Thickness = " + thick);
    }
}

// Driver class
public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length:");
        double length = sc.nextDouble();

        System.out.println("Enter width:");
        double width = sc.nextDouble();

        System.out.println("Enter height:");
        double height = sc.nextDouble();

        System.out.println("Enter thickness:");
        double thick = sc.nextDouble();

        WoodBox wb = new WoodBox(length, width, height, thick);

        System.out.println("\nDisplaying Dimensions:");
        wb.display();
    }
}
