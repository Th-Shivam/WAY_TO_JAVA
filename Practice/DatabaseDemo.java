import java.sql.*;

public class DatabaseDemo {
    public static void main(String[] args) {

        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");

            Statement stmt = con.createStatement();

            // 3. Create Table
            String createTable = "CREATE TABLE IF NOT EXISTS student (" +
                                 "id INT PRIMARY KEY, name VARCHAR(50))";
            stmt.executeUpdate(createTable);

            // 4. Insert Records
            stmt.executeUpdate("INSERT INTO student VALUES (1, 'Shivam')");
            stmt.executeUpdate("INSERT INTO student VALUES (2, 'Rudra')");
            stmt.executeUpdate("INSERT INTO student VALUES (3, 'Aman')");
            stmt.executeUpdate("INSERT INTO student VALUES (4, 'Rahul')");
            stmt.executeUpdate("INSERT INTO student VALUES (5, 'Sita')");

            // 5. Display Records
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            System.out.println("ID\tName");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" + rs.getString("name"));
            }

            // 6. Close Connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}