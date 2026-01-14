import java.util.Scanner;

interface Employee {
    void getDetails();
}

interface Mgr extends Employee {
    void getDeptDetails();
}

class Head implements Mgr {
    public int EmpID, DeptID;
    public String EmpName, DeptName;

    Head(int EmpID, int DeptID, String EmpName, String DeptName) {
        this.EmpID = EmpID;
        this.DeptID = DeptID;
        this.EmpName = EmpName;
        this.DeptName = DeptName;
    }

    @Override
    public void getDetails() {
        System.out.println("Name: " + EmpName);
        System.out.println("Employee ID: " + EmpID);
    }

    @Override
    public void getDeptDetails() {
        System.out.println("Department: " + DeptName);
        System.out.println("Department ID: " + DeptID);
    }
}

public class Q3 {
    static Scanner rd = new Scanner(System.in);
    public static void main(String[] args) {
        int eid, did;
        String ename, dname;

        System.out.println("Enter Name: ");
        ename = rd.nextLine();

        System.out.println("Enter Employee ID: ");
        eid = rd.nextInt();

        rd.nextLine();

        System.out.println("Enter Department: ");
        dname = rd.nextLine();

        System.out.println("Enter Department ID: ");
        did = rd.nextInt();

        Head e = new Head(eid,did,ename,dname);

        e.getDetails();
        e.getDeptDetails();
    }
}