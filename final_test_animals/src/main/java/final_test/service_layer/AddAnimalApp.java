package final_test.service_layer;


//import final_test.model_layer.Cats;
//import final_test.model_layer.Animals;
//import final_test.model_layer.Dogs;
//import final_test.model_layer.Horses;

import final_test.model_layer.*;

import java.util.Scanner;

public class AddAnimalApp {
    public void addAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип животного (Dogs, Cats, Hamsters, Horses, Camels или Donkeys): ");
        String animalType = scanner.nextLine();

        Animals newAnimal;

        switch (animalType.toLowerCase()) {
            case "dogs":
                newAnimal = createDog();
                DatabaseOperations.addAnimalToDatabase(newAnimal);
                break;
            case "cats":
                newAnimal = createCat();
                DatabaseOperations.addAnimalToDatabase(newAnimal);
                break;
            case "hamsters":
                newAnimal = createHamster();
                DatabaseOperations.addAnimalToDatabase(newAnimal);
                break;
            case "horses":
                newAnimal = createHorse();
                DatabaseOperations.addAnimalToDatabase(newAnimal);
                break;
            case "camels":
                newAnimal = createCamel();
                DatabaseOperations.addAnimalToDatabase(newAnimal);
                break;
            case "donkeys":
                newAnimal = createDonkey();
                DatabaseOperations.addAnimalToDatabase(newAnimal);
                break;
            default:
                System.out.println("Неправильный тип животного.");
        }
    }

    // Методы для создания объектов конкретных типов животных
    public static Dogs createDog() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя собаки: ");
        String name = scanner.nextLine();

        String type = "Dog";

        System.out.println("Введите дату рождения собаки (гггг-мм-дд): ");
        String birthDate = scanner.nextLine();

        System.out.println("Введите команды для собаки через запятую (например, Sit, Stay, Fetch, Bark, Paw, Roll): ");
        String commands = scanner.nextLine();

        return new Dogs(name, type, birthDate, commands);
    }

    public static Cats createCat() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя кошки: ");
        String name = scanner.nextLine();

        String type = "Cat";

        System.out.println("Введите дату рождения кошки (гггг-мм-дд): ");
        String birthDate = scanner.nextLine();

        System.out.println("Введите команды для кошки через запятую (например, Sit, Stay, Pounce, Scratch, Mew, Jump): ");
        String commands = scanner.nextLine();

        return new Cats(name, type, birthDate, commands);
    }

    public static Hamster createHamster() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя хомяка: ");
        String name = scanner.nextLine();

        String type = "Hamster";

        System.out.println("Введите дату рождения хомяка (гггг-мм-дд): ");
        String birthDate = scanner.nextLine();

        System.out.println("Введите команды для хомяка через запятую (например, Roll, Hide, Collect, Spin): ");
        String commands = scanner.nextLine();

        return new Hamster(name, type, birthDate, commands);
    }

    public static Horses createHorse() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя лошади: ");
        String name = scanner.nextLine();

        String type = "Horse";

        System.out.println("Введите дату рождения лошади (гггг-мм-дд): ");
        String birthDate = scanner.nextLine();

        System.out.println("Введите команды для лошади через запятую (например, Walk, Trot, Canter, Gallop, Run, Jump): ");
        String commands = scanner.nextLine();

        return new Horses(name, type, birthDate, commands);
    }

    public static Camels createCamel() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя верблюда: ");
        String name = scanner.nextLine();

        String type = "Camel";

        System.out.println("Введите дату рождения верблюда (гггг-мм-дд): ");
        String birthDate = scanner.nextLine();

        System.out.println("Введите команды для верблюда через запятую (например, Load, Unload, Travel, Sit, Walk): ");
        String commands = scanner.nextLine();

        return new Camels(name,type ,birthDate, commands);
    }

    public static Donkeys createDonkey() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя осла: ");
        String name = scanner.nextLine();

        String type = "Dog";

        System.out.println("Введите дату рождения осла (гггг-мм-дд): ");
        String birthDate = scanner.nextLine();

        System.out.println("Введите команды для осла через запятую (например, Carry, Follow, Work, Bray, Kick): ");
        String commands = scanner.nextLine();

        return new Donkeys(name,type ,birthDate, commands);
    }
}

