
import java.util.Scanner;
import HR.Manager;
import Exceptions.InvalidNameException;
import Exceptions.InvalidSalaryException;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter empid: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter basic salary: ");
            double basic = sc.nextDouble();

            Manager m = new Manager(id, name, basic);

            System.out.println("\nEmployee ID: " + id);
            System.out.println("Employee Name: " + m.getName());
            System.out.println("Earnings: " + m.earnings());
            System.out.println("Bonus: " + m.bonus());

        }
        catch (InvalidNameException e) {
            System.out.println("InvalidNameException: " + e.getMessage());
        }
        catch (InvalidSalaryException e) {
            System.out.println("InvalidSalaryException: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }

        sc.close();
    }
}