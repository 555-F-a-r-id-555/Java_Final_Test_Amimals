package final_test;

import final_test.data_access_layer.DatabaseConnector;
import final_test.service_layer.*;
import final_test.data_access_layer.CreateTables;
import final_test.data_access_layer.CreateDatabase;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CreateDatabase createDatabase = CreateDatabase.createNewDatabase();
        CreateTables.createTablesAndInsertData();

        System.out.println("\n\n");
        Scanner scanner = new Scanner(System.in);


        Integer makeAChoice;
        while (true) {
//            System.out.println("Выберити команду :\n" +
//                    "Вводить нужно лишь цифры 1,2,3,4,5,6. Описание ниже\n" +
//                    "1- Добавление нового животного - название класса addAnimalApp\n" +
//                    "2- Показать список всех животных - название класса showAll\n" +
//                    "3- Показать команды животного по его id - название класса showCommandsById\n" +
//                    "4- Обучить животное новым командам - название класса learnNewCommand\n" +
//                    "5- Подсчитать количество животных - название класса animalCounter\n" +
//                    "6- вывести id,Имя животного  и возраст в порядке возрастания в каждой таблице - название класса getAgeAndSort\n");
            System.out.println("\u001B[34m*|****************************************************************************************************************|*");
            System.out.println("*| Выберите команду:                                                                                              |*");
            System.out.println("*| Вводить нужно лишь цифры 1,2,3,4,5,6.                                                                          |*");
            System.out.println("*| Описание ниже:                                                                                                 |*");
            System.out.println("*| 1 - Добавление нового животного - название класса addAnimalApp                                                 |*");
            System.out.println("*| 2 - Показать список всех животных - название класса showAll                                                    |*");
            System.out.println("*| 3 - Показать команды животного по его id - название класса showCommandsById                                    |*");
            System.out.println("*| 4 - Обучить животное новым командам - название класса learnNewCommand                                          |*");
            System.out.println("*| 5 - Подсчитать количество животных - название класса animalCounter                                             |*");
            System.out.println("*| 6 - Вывести id, имя животного и возраст в порядке возрастания в каждой таблице - название класса getAgeAndSort |*");
            System.out.println("*|                                                                                                                |*");
            System.out.println("*|****************************************************************************************************************|*\u001B[0m\n");


            String input = scanner.nextLine();

            if (input.matches("\\d+")) {
                makeAChoice = Integer.parseInt(input);
                break;
            } else {
                System.out.println("Вы должены ввести числом. Попробуйте снова.");
            }
        }

        switch (makeAChoice) {
            case 1:
                AddAnimalApp addAnimalApp = new AddAnimalApp();
                addAnimalApp.addAnimal();
                break;
            case 2:
                ShowAll showAll = new ShowAll();
                showAll.showPets();
                showAll.showPackAnimals();
                break;
            case 3:
                ShowCommandsById showCommandsById = new ShowCommandsById();
                showCommandsById.showComandsById();
                break;
            case 4:
                LearnNewCommand learnNewCommand = new LearnNewCommand();
                learnNewCommand.learnNewCommand();
                break;
            case 5:
                AnimalCounter animalCounter = new AnimalCounter();
                animalCounter.countAnimals();
                break;
            case 6:
                GetAgeAndSort getAgeAndSort = new GetAgeAndSort();
                getAgeAndSort.animalSortByAge();
                break;
            default:
                System.out.println("Числа должны быть от 1 до 6.");

        }


//        AddAnimalApp addAnimalApp = new AddAnimalApp();
//        addAnimalApp.addAnimal();


//        ShowAll showAll = new ShowAll();
//        showAll.showPets();
//        showAll.showPackAnimals();

//        ShowCommandsById showCommandsById = new ShowCommandsById();
//        showCommandsById.showComandsById();


//        LearnNewCommand learnNewCommand = new LearnNewCommand();
//        learnNewCommand.learnNewCommand();

//        AnimalCounter animalCounter = new AnimalCounter();
//        animalCounter.countAnimals();

//        GetAgeAndSort getAgeAndSort = new GetAgeAndSort();
//        getAgeAndSort.animalSortByAge();

    }
}
