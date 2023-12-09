package final_test.data_access_layer;

//import org.example.DatabaseConnector;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
    public static CreateDatabase createNewDatabase() {
        try (Connection conn = DatabaseConnector.getConnection("OK")) {
            Statement statement = conn.createStatement();
            String sql = "CREATE DATABASE IF NOT EXISTS Animal105";
            statement.executeUpdate(sql);
            System.out.println("База данных Animal105 создана успешно!");
        } catch (SQLException e) {
            System.out.println("Ошибка при создании базы данных: " + e.getMessage());
        }
        return null;
    }
}