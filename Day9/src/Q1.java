import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter student RollNo:");
            int rollNo = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter student Name:");
            String name = sc.nextLine();

            System.out.println("Enter Subject:");
            String subject = sc.nextLine();

            System.out.println("Enter Marks:");
            int marks = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the name of existing file:");
            String fileName = sc.nextLine();

            FileWriter writer = new FileWriter(fileName, true);

            writer.write("Roll No: " + rollNo + "\n");
            writer.write("Name: " + name + "\n");
            writer.write("Subject: " + subject + "\n");
            writer.write("Marks: " + marks + "\n");
            writer.write("--------------------------\n");

            writer.close();

            System.out.println("\nData successfully written to file.\n");
            System.out.println("Displaying file contents:\n");

            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }

            fileReader.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }

        sc.close();
    }
}
