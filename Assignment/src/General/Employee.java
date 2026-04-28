package General;

import Exceptions.InvalidNameException;
import Exceptions.InvalidSalaryException;

public class Employee {
    protected int empid;
    private String ename;
    protected double basic;

    public Employee(int empid, String ename, double basic)
            throws InvalidNameException, InvalidSalaryException {

        this.empid = empid;

        if (!ename.matches("[a-zA-Z]+")) {
            throw new InvalidNameException("Name must contain only alphabets");
        }
        this.ename = ename.toUpperCase();

        if (basic < 0) {
            throw new InvalidSalaryException("Salary cannot be negative");
        }
        this.basic = basic;
    }

    public String getName() {
        return ename;
    }

    public double earnings() {
        double da = 0.80 * basic;
        double hra = 0.15 * basic;
        return basic + da + hra;
    }
}