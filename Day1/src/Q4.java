import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String num = read.next();

        for(int i=0;i<num.length()/2;i++) {
            if(num.charAt(i)!=num.charAt(num.length()-i-1)) {
                System.out.println("Not a Palindrome");
                System.exit(0);
            }
        }

        System.out.println("It is a Palindrome");
    }
}
