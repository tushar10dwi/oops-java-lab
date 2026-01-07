import java.util.Scanner;

class Box {
    double length;
    double width;
    double height;

    Box(double l, double b, double h) {
        length = l;
        width = b;
        height = h;
    }
    double volume() {
        return length * width * height;
    }
}

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double l,b,h;

        System.out.println("Enter length:");
        l = sc.nextDouble();

        System.out.println("Enter width:");
        b = sc.nextDouble();

        System.out.println("Enter height:");
        h = sc.nextDouble();

        Box box = new Box(l,b,h);

        System.out.println("Volume of the box = " + box.volume());

        sc.close();
    }
}

