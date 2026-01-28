import java.util.Scanner;

interface Salary {
    void earnings();
    void deductions();
    void bonus();
}

    abstract class Manager implements Salary{
    public int basic;

    Manager(int basic) {
        this.basic = basic;
    }

    @Override
    public void earnings() {
        int e = basic + basic/100*80 + basic/100*15;
        System.out.println("Earnings: " + e);
    }

    @Override
    public void deductions() {
        System.out.println("Deductions: " + basic/100*12);
    }
}

class SubStaff extends Manager {
    SubStaff(int basic) {
        super(basic);
    }

    @Override
    public void bonus() {
        System.out.println("Bonus: " + basic/100*50);
    }
}

public class Q2 {
    static Scanner rd = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Basic Amount: ");
        int base = rd.nextInt();

        SubStaff s = new SubStaff(base);

        s.earnings();
        s.deductions();
        s.bonus();

        rd.close();
    }
}
