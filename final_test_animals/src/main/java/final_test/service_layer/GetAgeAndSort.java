package final_test.service_layer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import final_test.data_access_layer.DatabaseConnector;

public class GetAgeAndSort {

    public void animalSortByAge() {
        displaySortedAge("Pets");
        displaySortedAge("PackAnimals");
    }

    public static void displaySortedAge(String tableName) {
        System.out.println("Сортировка по возрастанию для таблицы " + tableName + ":");

        try (Connection connection = DatabaseConnector.getConnection()) {
            Statement statement = connection.createStatement();
            String query = "SELECT ID, Name, " +
                    "TIMESTAMPDIFF(YEAR, BirthDate, CURDATE()) AS AgeYears, " +
                    "TIMESTAMPDIFF(MONTH, BirthDate, CURDATE()) % 12 AS AgeMonths, " +
                    "TIMESTAMPDIFF(DAY, BirthDate, CURDATE()) % 30 AS AgeDays " +
                    "FROM " + tableName + " ORDER BY AgeYears ASC, AgeMonths ASC, AgeDays ASC";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("Name");
                int ageYears = resultSet.getInt("AgeYears");
                int ageMonths = resultSet.getInt("AgeMonths");
                int ageDays = resultSet.getInt("AgeDays");

                System.out.println("ID: " + id + ", Имя: " + name + ", Возраст: " +
                        ageYears + " год(а)/лет, " + ageMonths + " месяц(ев), " +
                        ageDays + " день(дней)");
            }
        } catch (SQLException e) {
            System.out.println("Ошибка при получении данных из таблицы " + tableName + ": " + e.getMessage());
        }

//    public static void displaySortedAge(String tableName) {
//        System.out.println("Сортировка по возрастанию для таблицы " + tableName + ":");
//        try (Connection connection = DatabaseConnector.getConnection()) {
//            Statement statement = connection.createStatement();
//            String query = "SELECT ID, Name, TIMESTAMPDIFF(YEAR, BirthDate, CURDATE()) AS Age " +
//                    "FROM " + tableName + " ORDER BY Age ASC";
//            ResultSet resultSet = statement.executeQuery(query);
//
//            while (resultSet.next()) {
//                int id = resultSet.getInt("ID");
//                String name = resultSet.getString("Name");
//                int age = resultSet.getInt("Age");
//
//                System.out.println("ID: " + id + ", Имя: " + name + ", Возраст: " + age + " год(а)/лет");
//            }
//        } catch (SQLException e) {
//            System.out.println("Ошибка при получении данных из таблицы " + tableName + ": " + e.getMessage());
//        }
//    }

    }
}

