import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int evenCount = 0, oddCount = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of Even numbers = " + evenCount);
        System.out.println("Number of Odd numbers  = " + oddCount);

    }
}
