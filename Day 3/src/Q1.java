import java.util.Scanner;

class Sheet {
    double length, breadth;
    double rate2D = 40.0;

    void get2DDimensions(double l, double b) {
        length = l;
        breadth = b;
    }

    double calculate2DCost() {
        double area = length * breadth;
        return area * rate2D;
    }
}

class Box extends Sheet {
    double height;
    final double rate3D = 60.0;

    void get3DDimensions(double l, double b, double h) {
        get2DDimensions(l, b);
        height = h;
    }

    double calculate3DCost() {
        double volume = length * breadth * height;
        return volume * rate3D;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length:");
        double length = sc.nextDouble();

        System.out.println("Enter breadth:");
        double breadth = sc.nextDouble();

        System.out.println("Enter height (Enter 0 for 2D Sheet):");
        double height = sc.nextDouble();

        if (height == 0) {
            Sheet sheet = new Sheet();
            sheet.get2DDimensions(length, breadth);
            System.out.println("Cost of Plastic Sheet = " + sheet.calculate2DCost());
        } else {
            Box box = new Box();
            box.get3DDimensions(length, breadth, height);
            System.out.println("Cost of Plastic Box = " + box.calculate3DCost());
        }
    }
}
