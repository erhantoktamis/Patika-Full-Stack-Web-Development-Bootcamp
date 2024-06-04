import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static final String DB_URL = "jdbc:mysql://localhost/employee";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connect = null;
        Statement st = null;
        ResultSet resultSet = null;

        try {
            connect = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            st = connect.createStatement();

            // INSERT 
            String insertQuery1 = "INSERT INTO employees (name, position, salary) VALUES ('Tommi', 'doctor', 50000)";
            st.executeUpdate(insertQuery1);

            String insertQuery2 = "INSERT INTO employees (name, position, salary) VALUES ('Katharina', 'teacher', 40000)";
            st.executeUpdate(insertQuery2);

            String insertQuery3 = "INSERT INTO employees (name, position, salary) VALUES ('Jackson', 'engineer', 60000)";
            st.executeUpdate(insertQuery3);

            String insertQuery4 = "INSERT INTO employees (name, position, salary) VALUES ('Anderea', 'tailor', 25000)";
            st.executeUpdate(insertQuery4);

            String insertQuery5 = "INSERT INTO employees (name, position, salary) VALUES ('Marry', 'nurse', 45000)";
            st.executeUpdate(insertQuery5);

            // SELECT 
            String selectQuery = "SELECT * FROM employees";
            resultSet = st.executeQuery(selectQuery);

            // ResultSet
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String position = resultSet.getString("position");
                int salary = resultSet.getInt("salary");

                System.out.println("Name: " + name + ", Position: " + position + ", Salary: " + salary);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                // Kullanılan kaynakları kapatma
                if (resultSet != null) resultSet.close();
                if (st != null) st.close();
                if (connect != null) connect.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
