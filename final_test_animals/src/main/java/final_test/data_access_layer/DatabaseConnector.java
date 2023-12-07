package final_test.data_access_layer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    private static final String URL = "jdbc:mysql://192.168.1.68:3306/Animal8";
    private static final String USER = "ip64";
    private static final String PASSWORD = "123";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Соединение с базой данных установлено!");
        } catch (SQLException e) {
            System.out.println("Ошибка при соединении с базой данных: " + e.getMessage());
        }
        return connection;
    }
}