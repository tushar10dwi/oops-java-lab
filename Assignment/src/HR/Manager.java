package HR;

import General.Employee;
import Exceptions.InvalidNameException;
import Exceptions.InvalidSalaryException;

public class Manager extends Employee {

    public Manager(int empid, String ename, double basic)
            throws InvalidNameException, InvalidSalaryException {
        super(empid, ename, basic);
    }

    public double bonus() {
        return 0.20 * earnings();
    }
}