package final_test.data_access_layer;

import final_test.model_layer.PackAnimals;
import final_test.model_layer.Pets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {

    public static void addPet(Pets pet) {
        String insertPetQuery = "INSERT INTO Pets (Name, Type, BirthDate, Commands) VALUES (?, ?, ?, ?)";

        try (Connection connection = DatabaseConnector.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertPetQuery)) {

            preparedStatement.setString(1, pet.getName());
            preparedStatement.setString(2, pet.getType());
            preparedStatement.setString(3, pet.getBirthDate());
            preparedStatement.setString(4, pet.getCommands());

            preparedStatement.executeUpdate();
            System.out.println("Животное успешно добавлено в базу данных!");

        } catch (SQLException e) {
            System.out.println("Ошибка при добавлении животного в базу данных: " + e.getMessage());
        }
    }

    public static void addPackAnimal(PackAnimals pet) {
        String insertPetQuery = "INSERT INTO PackAnimals (Name, Type, BirthDate, Commands) VALUES (?, ?, ?, ?)";

        try (Connection connection = DatabaseConnector.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertPetQuery)) {

            preparedStatement.setString(1, pet.getName());
            preparedStatement.setString(2, pet.getType());
            preparedStatement.setString(3, pet.getBirthDate());
            preparedStatement.setString(4, pet.getCommands());

            preparedStatement.executeUpdate();
            System.out.println("Животное успешно добавлено в базу данных!");

        } catch (SQLException e) {
            System.out.println("Ошибка при добавлении животного в базу данных: " + e.getMessage());
        }
    }

}
