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
            // Force load driver (safe step)
            Class.forName("org.postgresql.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully!");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT version();");

            while (rs.next()) {
                System.out.println("PostgreSQL Version: " + rs.getString(1));
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}