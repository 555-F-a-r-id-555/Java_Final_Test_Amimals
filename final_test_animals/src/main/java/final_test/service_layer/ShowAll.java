package final_test.service_layer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import final_test.data_access_layer.DatabaseConnector;

public class ShowAll {

    public void showPets() {
        try (Connection connection = DatabaseConnector.getConnection()) {
            String query = "SELECT * FROM Pets";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            System.out.println("Содержимое таблицы Pets:");

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("Name");
                String type = resultSet.getString("Type");
                String birthDate = resultSet.getString("BirthDate");
                String commands = resultSet.getString("Commands");

                System.out.println("ID: " + id + ", Name: " + name + ", Type: " + type + ", BirthDate: " + birthDate + ", Commands: " + commands);
            }
        } catch (SQLException e) {
            System.out.println("Ошибка при получении данных из таблицы Pets: " + e.getMessage());
        }
    }

    public void showPackAnimals() {
        try (Connection connection = DatabaseConnector.getConnection()) {
            String query = "SELECT * FROM PackAnimals";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            System.out.println("Содержимое таблицы PackAnimals:");

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("Name");
                String type = resultSet.getString("Type");
                String birthDate = resultSet.getString("BirthDate");
                String commands = resultSet.getString("Commands");

                System.out.println("ID: " + id + ", Name: " + name + ", Type: " + type + ", BirthDate: " + birthDate + ", Commands: " + commands);
            }
        } catch (SQLException e) {
            System.out.println("Ошибка при получении данных из таблицы PackAnimals: " + e.getMessage());
        }
    }

}

