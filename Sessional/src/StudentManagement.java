import java.io.*;
import java.util.*;

// Tushar Dwivedi 24052691
class InvalidCGPAException extends Exception {
    public InvalidCGPAException(String message) {
        super(message);
    }
}

class Student implements Serializable {
    int rollNo;
    String name;
    double cgpa;

    Student(int rollNo, String name, double cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", CGPA: " + cgpa);
    }
}

public class StudentManagement {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void validateCGPA(double cgpa) throws InvalidCGPAException {
        if (cgpa < 0 || cgpa > 10) {
            throw new InvalidCGPAException("CGPA must be between 0 and 10!");
        }
    }

    static void addStudent() {
        try {
            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter CGPA: ");
            double cgpa = sc.nextDouble();

            validateCGPA(cgpa);

            students.add(new Student(roll, name, cgpa));
            System.out.println("Student added successfully!");

        } catch (InvalidCGPAException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input!");
            sc.nextLine();
        }
    }

    static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student s : students) {
            s.display();
        }
    }

    static void findLowestCGPA() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        Student min = students.get(0);
        for (Student s : students) {
            if (s.cgpa < min.cgpa) {
                min = s;
            }
        }

        System.out.println("Student with lowest CGPA:");
        min.display();
    }

    static void searchStudent() {
        System.out.print("Enter Roll No to search: ");
        int roll = sc.nextInt();

        for (Student s : students) {
            if (s.rollNo == roll) {
                System.out.println("Student found:");
                s.display();
                return;
            }
        }

        System.out.println("Student not found.");
    }

    static void saveToFile() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt"));

            for (Student s : students) {
                // Format: rollNo,name,cgpa
                bw.write(s.rollNo + "," + s.name + "," + s.cgpa);
                bw.newLine();
            }

            bw.close();
            System.out.println("Data saved to students.txt");

        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }

    static void readFromFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            String line;

            students.clear();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                int roll = Integer.parseInt(data[0]);
                String name = data[1];
                double cgpa = Double.parseDouble(data[2]);

                students.add(new Student(roll, name, cgpa));
            }

            br.close();

            System.out.println("Data loaded from file:");
            displayStudents();

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Find Lowest CGPA");
            System.out.println("4. Search by Roll No");
            System.out.println("5. Save to File");
            System.out.println("6. Read from File");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: displayStudents(); break;
                case 3: findLowestCGPA(); break;
                case 4: searchStudent(); break;
                case 5: saveToFile(); break;
                case 6: readFromFile(); break;
                case 7: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }

        } while (choice != 7);
    }
}