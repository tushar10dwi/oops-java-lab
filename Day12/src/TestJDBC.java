import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestJDBC {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/testdb";
        String user = "xaricon";
        String password = "qwerty00";

        try {
            // Load driver
            Class.forName("org.postgresql.Driver");

            // Connect
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully!");

            Statement stmt = conn.createStatement();

            // 1. Create table
            String createTable = "CREATE TABLE IF NOT EXISTS students (" +
                    "id SERIAL PRIMARY KEY, " +
                    "name VARCHAR(50), " +
                    "age INT)";
            stmt.executeUpdate(createTable);
            System.out.println("Table created!");

            // 2. Insert data
            String insert = "INSERT INTO students (name, age) VALUES ('Aditya', 24052690)";
            stmt.executeUpdate(insert);
            System.out.println("Student inserted!");

            // 3. Display data
            String select = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(select);

            System.out.println("\nStudents Table:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getInt("age")
                );
            }

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}