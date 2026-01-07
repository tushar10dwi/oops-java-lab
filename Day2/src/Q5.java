import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;

    void read(Scanner sc) {
        System.out.print("Enter Roll No: ");
        roll = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter CGPA: ");
        cgpa = sc.nextDouble();
    }

    void display() {
        System.out.println(roll + "\t" + name + "\t" + cgpa);
    }
}

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));
            students[i] = new Student();
            students[i].read(sc);
        }

        System.out.println("\nRoll\tName\tCGPA");
        for (int i = 0; i < n; i++) {
            students[i].display();
        }

        int index = 0;
        double minCgpa = students[0].cgpa;

        for (int i = 1; i < n; i++) {
            if (students[i].cgpa < minCgpa) {
                minCgpa = students[i].cgpa;
                index = i;
            }
        }

        System.out.println("\nStudent with lowest CGPA:");
        System.out.println("Name: " + students[index].name);

        sc.close();
    }
}
