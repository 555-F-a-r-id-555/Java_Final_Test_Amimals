package final_test.data_access_layer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTables {
    public static void createTablesAndInsertData() {
        try (Connection conn = DatabaseConnector.getConnection()) {
            Statement statement = conn.createStatement();

            String createPetsTableSQL = "CREATE TABLE IF NOT EXISTS Pets (ID INT PRIMARY KEY AUTO_INCREMENT, Name VARCHAR(50), Type VARCHAR(50), BirthDate DATE, Commands VARCHAR(100))";
            statement.executeUpdate(createPetsTableSQL);

            String createPackAnimalsTableSQL = "CREATE TABLE IF NOT EXISTS PackAnimals (ID INT PRIMARY KEY AUTO_INCREMENT, Name VARCHAR(50), Type VARCHAR(50), BirthDate DATE, Commands VARCHAR(100))";
            statement.executeUpdate(createPackAnimalsTableSQL);

            System.out.println("Таблицы Pets и PackAnimals созданы успешно!");
        } catch (SQLException e) {
            System.out.println("Ошибка при создании таблиц: " + e.getMessage());
        }
    }
}




