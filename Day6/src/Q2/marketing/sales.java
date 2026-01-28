package Q2.marketing;

import Q2.general.employee;

public class sales extends employee {

    public sales(int empid, String ename, double basic) {
        super(empid, ename, basic);
    }

    public double tallowance() {
        return 0.05 * earnings();
    }

    public void display() {
        double totalEarning = earnings() + tallowance();
        System.out.println("The emp id of the employee is " + empid);
        System.out.println("The total earning is " + totalEarning);
    }
}
