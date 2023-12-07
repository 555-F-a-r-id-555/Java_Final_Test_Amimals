package final_test.service_layer;

import final_test.model_layer.Animals;
import final_test.model_layer.PackAnimals;
import final_test.model_layer.Pets;
import final_test.data_access_layer.DatabaseConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseOperations {
    public static void addAnimalToDatabase(Animals animal) {
        String tableName;
        String insertAnimalQuery;

        if (animal instanceof Pets) {
            tableName = "Pets";
            insertAnimalQuery = "INSERT INTO Pets (Name, Type, BirthDate, Commands) VALUES (?, ?, ?, ?)";
        } else if (animal instanceof PackAnimals) {
            tableName = "PackAnimals";
            insertAnimalQuery = "INSERT INTO PackAnimals (Name, Type, BirthDate, Commands) VALUES (?, ?, ?, ?)";
        } else {
            System.out.println("Невозможно определить таблицу для добавления животного.");
            return;
        }

        try (Connection connection = DatabaseConnector.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertAnimalQuery)) {

            preparedStatement.setString(1, animal.getName());
            preparedStatement.setString(2, animal.getType());
            preparedStatement.setString(3, animal.getBirthDate());
            // Проверяем, является ли животное домашним или грузовым
            if (animal instanceof Pets) {
                Pets pet = (Pets) animal;
                preparedStatement.setString(4, pet.getCommands());
            } else {
                PackAnimals packAnimal = (PackAnimals) animal;
                preparedStatement.setString(4, packAnimal.getCommands());
            }

            preparedStatement.executeUpdate();
            System.out.println("Животное успешно добавлено в таблицу " + tableName + " базы данных!");

        } catch (SQLException e) {
            System.out.println("Ошибка при добавлении животного в базу данных: " + e.getMessage());
        }
    }
}
