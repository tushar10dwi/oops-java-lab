import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String first = rd.next();
        System.out.println("Enter last name: ");
        String last = rd.next();

        System.out.println(last+" "+first);
    }
}
