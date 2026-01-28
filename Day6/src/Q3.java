class University {
    String universityName;
    String location;

    // Constructor of outer class
    University(String universityName, String location) {
        this.universityName = universityName;
        this.location = location;
    }

    // Inner class
    class Department {
        String deptName;
        String hodName;

        Department(String deptName, String hodName) {
            this.deptName = deptName;
            this.hodName = hodName;
        }

        // Method to display details
        void display() {
            System.out.println("University Name : " + universityName);
            System.out.println("Location        : " + location);
            System.out.println("Department Name : " + deptName);
            System.out.println("HOD Name        : " + hodName);
        }
    }

    // Method to create inner class object
    void createDepartment(String deptName, String hodName) {
        Department d = new Department(deptName, hodName);
        d.display();
    }

    // Main method
    public static void main(String[] args) {
        University u = new University("Delhi University", "New Delhi");
        u.createDepartment("Computer Science", "Dr. Sharma");
    }
}
