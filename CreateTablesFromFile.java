import java.io.*;
import java.sql.*;
public class CreateTablesFromFile {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/";
        String username = "root";  // Update your MySQL username
        String password = "P@ssword19";  // Update your MySQL password
        String databaseName = "database2"; // Name of the database to create
        String sqlFilePath = "example.txt"; // Path to your SQL file

        try (Connection conn = DriverManager.getConnection(jdbcURL, username, password);
             Statement stmt = conn.createStatement()) {

            // Create the database if it doesn't exist
            String createDBSQL = "CREATE DATABASE IF NOT EXISTS " + databaseName;
            stmt.executeUpdate(createDBSQL);
            System.out.println("✅ Database created or already exists: " + databaseName);

            // Connect to the newly created database
            try (Connection dbConn = DriverManager.getConnection(jdbcURL + databaseName, username, password);
                 Statement dbStmt = dbConn.createStatement();
                 BufferedReader reader = new BufferedReader(new FileReader(sqlFilePath))) {

                StringBuilder sqlBuilder = new StringBuilder();
                String line;

                // Read SQL commands from file
                while ((line = reader.readLine()) != null) {
                    sqlBuilder.append(line).append("\n");
                }

                // Split SQL statements using ";" delimiter
                String[] sqlStatements = sqlBuilder.toString().split(";");

                for (String sql : sqlStatements) {
                    if (!sql.trim().isEmpty()) {
                        try {
                            dbStmt.executeUpdate(sql.trim());
                        } catch (SQLException e) {
                            System.out.println("❌ Error executing SQL command.");
                            System.out.println("🔺 Error Message: " + e.getMessage());
                        }
                    }
                }

                System.out.println("✅ Tables created successfully!");
            }

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}