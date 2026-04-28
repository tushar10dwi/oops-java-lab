import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String s = read.nextLine();
        System.out.println(changeCase(s));
        System.out.println(reverse(s));

        System.out.println("Enter second String for comparison: ");
        String s2 = read.nextLine();
        if (s.compareTo(s2) > 0) {
            System.out.println("Not same!\n");
        }
        else System.out.println("Same. \n");

        System.out.println("Enter String to insert into first String: ");
        String s3 = read.nextLine();

        System.out.println(s.concat(s3));

        System.out.println("Enter a String: ");
        String s4 = read.nextLine();

        System.out.println("Uppercase: " + s.toUpperCase() + "\n");
        System.out.println("Lowercase: " + s.toLowerCase() + "\n");

        System.out.println("Enter a String: ");
        String s5 = read.nextLine();
        System.out.println("Enter a character: ");
        char ch = read.next().charAt(0);
        if( s.indexOf(ch) >= 0) {
            System.out.println(s.indexOf(ch));
        }
        else System.out.println("Not found!");
    }

    static String changeCase(String s) {
        int val = s.compareTo(s.toUpperCase());
        if(val > 0) {
            return s.toLowerCase();
        }
        return s.toUpperCase();
    }

    static String reverse(String s) {
        String ns = "";
        for(int i=0;i<s.length();i++) {
            ns = ns.concat(s.charAt(i) + "");
        }
        return ns;
    }




}

