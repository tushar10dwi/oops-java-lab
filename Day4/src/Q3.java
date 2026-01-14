
// Student class
class Stud {
    int rollNo;
    String name;

    Stud(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Overriding equals() method
    @Override
    public boolean equals(Object obj) {

        // Type checking
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Stud s = (Stud) obj;

        // Comparing data members
        return this.rollNo == s.rollNo &&
                this.name.equals(s.name);
    }
}

// Driver class
public class Q3 {
    public static void main(String[] args) {

        Stud s1 = new Stud(101, "Rahul");
        Stud s2 = new Stud(101, "Rahul");

        if (s1.equals(s2))
            System.out.println("Both students are EQUAL");
        else
            System.out.println("Both students are NOT EQUAL");
    }
}
