import java.util.Scanner;

public class Q1 {
    String name;
    int roll;
    int sec;
    String branch;

    public Q1(String n, int r, int s, String b) {
        name = n;
        roll = r;
        sec = s;
        branch = b;
    }

    void getStudentDetails() {
        System.out.println("Name: "+name);
        System.out.println("Roll no: "+roll);
        System.out.println("Section: "+sec);
        System.out.println("Branch: "+branch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n,b;
        int r,s;
        System.out.println("Enter name: ");
        n = sc.nextLine();
        System.out.println("Enter roll: ");
        r = sc.nextInt();
        System.out.println("Enter Section: ");
        s = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Branch: ");
        b = sc.nextLine();

        Q1 student = new Q1(n,r,s,b);
        student.getStudentDetails();
    }

}
