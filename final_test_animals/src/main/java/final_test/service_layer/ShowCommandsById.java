package final_test.service_layer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import final_test.data_access_layer.DatabaseConnector;

public class ShowCommandsById {

    public void showComandsById() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя таблицы (Pets или PackAnimals): ");
        String tableName = scanner.nextLine();

        int id;
        while (true) {
            System.out.println("Введите ID животного: ");
            String input = scanner.nextLine();

            if (input.matches("\\d+")) {
                id = Integer.parseInt(input);
                break;
            } else {
                System.out.println("ID должен быть числом. Попробуйте снова.");
            }
        }

        showCommands(tableName, id);
    }

    public static void showCommands(String tableName, int id) {
        try (Connection connection = DatabaseConnector.getConnection()) {
            String query = "SELECT Commands FROM " + tableName + " WHERE ID = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String commands = resultSet.getString("Commands");
                System.out.println("Список команд для животного с ID " + id + ": " + commands);
            } else {
                System.out.println("Животное с ID " + id + " в таблице " + tableName + " не найдено.");
            }
        } catch (SQLException e) {
            System.out.println("Ошибка при получении команд: " + e.getMessage());
        }
    }
}

