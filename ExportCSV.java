
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExportCSV {

    public static void exportAttendanceToCSV(String filePath) {
        String url = "jdbc:mysql://localhost:3306/attendance_db";
        String username = "root";
        String password = "your_mysql_password";
        String query = "SELECT * FROM attendance_log";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);
             FileWriter csvWriter = new FileWriter(filePath)) {

            // Write header
            csvWriter.append("ID,Student Name,Timestamp\n");

            // Write data rows
            while (rs.next()) {
                csvWriter.append(rs.getInt("id") + ",");
                csvWriter.append(rs.getString("student_name") + ",");
                csvWriter.append(rs.getTimestamp("timestamp").toString() + "\n");
            }

            System.out.println("Data exported to CSV successfully!");

        } catch (SQLException | IOException e) {
            e.printStackTrace();
            System.out.println("Error exporting data to CSV.");
        }
    }

    // For testing the export function
    public static void main(String[] args) {
        exportAttendanceToCSV("attendance_export.csv");
    }
}
