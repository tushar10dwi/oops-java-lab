import java.util.Scanner;

public class Q3 {
    static int today = 1;

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter date number: ");
        int dt = read.nextInt();

        switch (dt%7) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
        }
    }
}
