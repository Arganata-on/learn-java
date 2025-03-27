import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ContohSoalDatabase {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student_db";
        String username = "root";
        String password = "nolep2133";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Koneksi berhasil!");

            String insertQuery = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "Arganata");
            preparedStatement.setInt(3, 21);
            int insertedRows = preparedStatement.executeUpdate();

            if (insertedRows > 0) {
                System.out.println("Data berhasil ditambahkan!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error");
        }
    }
}
