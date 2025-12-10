import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks>=90) {
            System.out.println("O grade");
        }
        else if (marks>=80) {
            System.out.println("E grade");
        }
        else if (marks>=70) {
            System.out.println("A grade");
        }
        else if (marks>=60) {
            System.out.println("B grade");
        }
        else {
            System.out.println("C grade");
        }

    }
}
