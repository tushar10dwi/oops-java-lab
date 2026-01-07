import java.util.Scanner;

class Q2 {

    static int count = 0;
    Q2() {
        count++;
    }
    static void displayCount() {
        System.out.println("Number of objects created = " + count);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of objects to create:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            new Q2();
        }

        Q2.displayCount();

        sc.close();
    }
}
